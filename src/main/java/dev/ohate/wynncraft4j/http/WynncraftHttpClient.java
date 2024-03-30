package dev.ohate.wynncraft4j.http;

import dev.ohate.wynncraft4j.WynncraftAPI;

import java.util.concurrent.CompletableFuture;

public interface WynncraftHttpClient {

    String DEFAULT_USER_AGENT = "Wynncraft4J/" + WynncraftAPI.VERSION;

    CompletableFuture<WynncraftHttpResponse> makeRequest(String url);

    void shutdown();

}
