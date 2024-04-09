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
    public WynncraftHttpResponse makeRequest(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("User-Agent", DEFAULT_USER_AGENT)
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            return new WynncraftHttpResponse(response.statusCode(), response.body(), createRateLimit(response));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void shutdown() {
        httpClient.shutdownNow();
    }

    private RateLimit createRateLimit(HttpResponse<String> response) {
        return new RateLimit(
                Integer.parseInt(response.headers().firstValue("RateLimit-Remaining").get()),
                Integer.parseInt(response.headers().firstValue("RateLimit-Reset").get()),
                Integer.parseInt(response.headers().firstValue("RateLimit-Limit").get())
        );
    }

}
