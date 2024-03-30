package dev.ohate.wynncraft4j;

import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class WynncraftAPI {

    public static final String BASE_URL = "https://api.wynncraft.com/v3/";
    public static final String VERSION = "1.0";

    private final WynncraftHttpClient httpClient;

    public WynncraftAPI(WynncraftHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void shutdown() {
        httpClient.shutdown();
    }

    public CompletableFuture<Player> getPlayer(UUID uuid) {
        return get(Player.class, "player/" + uuid);
    }

    private <T> CompletableFuture<T> get(Class<T> clazz, String request) {
        return get(clazz, request, null);
    }

    private <T> CompletableFuture<T> get(Class<T> clazz, String request, HTTPQueryParams params) {
        String url = BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        CompletableFuture<WynncraftHttpResponse> future = httpClient.makeRequest(url);

        return future.thenApply(response -> Utilities.GSON.fromJson(response.getBody(), clazz));
    }

}