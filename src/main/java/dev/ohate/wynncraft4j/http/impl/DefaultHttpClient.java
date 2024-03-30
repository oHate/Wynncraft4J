package dev.ohate.wynncraft4j.http.impl;

import dev.ohate.wynncraft4j.http.RateLimit;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DefaultHttpClient implements WynncraftHttpClient {

    private final ExecutorService executorService;
    private final HttpClient httpClient;

    public DefaultHttpClient() {
        this.executorService = Executors.newCachedThreadPool();
        this.httpClient = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    @Override
    public CompletableFuture<WynncraftHttpResponse> makeRequest(String url) {
        return CompletableFuture.supplyAsync(() -> {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .header("User-Agent", DEFAULT_USER_AGENT)
                    .GET()
                    .build();

            try {
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                return new WynncraftHttpResponse(response.statusCode(), response.body(), createRateLimitResponse(response));
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }

        }, executorService);
    }

    @Override
    public void shutdown() {
        httpClient.shutdownNow();
    }

    private RateLimit createRateLimitResponse(HttpResponse<String> response) {
        if (response.statusCode() != 200) {
            return null;
        }

        int remaining = Integer.parseInt(response.headers().firstValue("RateLimit-Remaining").get());
        int reset = Integer.parseInt(response.headers().firstValue("RateLimit-Reset").get());
        int limit = Integer.parseInt(response.headers().firstValue("RateLimit-Limit").get());

        return new RateLimit(remaining, reset, limit);
    }

}
