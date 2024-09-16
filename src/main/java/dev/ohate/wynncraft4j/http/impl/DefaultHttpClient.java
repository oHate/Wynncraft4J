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

public class DefaultHttpClient implements WynncraftHttpClient {

    private final HttpClient httpClient;

    /**
     * Constructs a new {@code DefaultHttpClient} with default configuration.
     * The client will follow redirects and has a connection timeout of 10 seconds.
     */
    public DefaultHttpClient() {
        this.httpClient = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    /**
     * Shuts down the HTTP client.
     */
    @Override
    public void shutdown() {
        httpClient.shutdownNow();
    }

    /**
     * Makes a GET request to the specified URL.
     *
     * @param url the target URL to which the GET request is sent.
     * @return a {@link WynncraftHttpResponse} containing the status code, body,
     * and rate limit information from the response.
     */
    @Override
    public WynncraftHttpResponse makeGetRequest(String url) {
        return getResponse(HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("User-Agent", DEFAULT_USER_AGENT)
                .GET()
                .build());
    }

    /**
     * Makes a POST request to the specified URL with the provided payload.
     *
     * @param url     the target URL to which the POST request is sent.
     * @param payload the payload to include in the POST request.
     * @return a {@link WynncraftHttpResponse} containing the status code, body,
     * and rate limit information from the response.
     */
    @Override
    public WynncraftHttpResponse makePostRequest(String url, String payload) {
        return getResponse(HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("User-Agent", DEFAULT_USER_AGENT)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build());
    }

    /**
     * Sends the provided HTTP request and returns the corresponding {@link WynncraftHttpResponse}.
     *
     * @param request the {@link HttpRequest} to be sent.
     * @return a {@link WynncraftHttpResponse} containing the status code, response body,
     * and rate limit information.
     * @throws RuntimeException if an I/O error occurs or the operation is interrupted.
     */
    private WynncraftHttpResponse getResponse(HttpRequest request) {
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            return new WynncraftHttpResponse(response.statusCode(), response.body(), createRateLimit(response));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a {@link RateLimit} object from the HTTP response headers.
     *
     * @param response the {@link HttpResponse} containing the rate limit headers
     * @return a {@link RateLimit} object representing the rate limit information
     */
    private RateLimit createRateLimit(HttpResponse<String> response) {
        return new RateLimit(
                Integer.parseInt(response.headers().firstValue("RateLimit-Remaining").get()),
                Integer.parseInt(response.headers().firstValue("RateLimit-Reset").get()),
                Integer.parseInt(response.headers().firstValue("RateLimit-Limit").get())
        );
    }

}
