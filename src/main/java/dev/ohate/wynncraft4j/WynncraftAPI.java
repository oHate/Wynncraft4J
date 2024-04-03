package dev.ohate.wynncraft4j;

import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.choices.GuildChoicePair;
import dev.ohate.wynncraft4j.model.choices.PlayerChoicePair;
import dev.ohate.wynncraft4j.model.classes.CharacterClass;
import dev.ohate.wynncraft4j.model.classes.ClassType;
import dev.ohate.wynncraft4j.model.guild.Guild;
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

    public CompletableFuture<Player> getPlayerByUuid(UUID uuid) {
        return get(Player.class, "player/" + uuid,
                HTTPQueryParams.create().add("fullResult", "True"));
    }

    public CompletableFuture<PlayerChoicePair> getPlayerByUsername(String username) {
        return get(PlayerChoicePair.class, "player/" + username,
                HTTPQueryParams.create().add("fullResult", "True"));
    }

    public CompletableFuture<Guild> getGuildByUuid(UUID uuid) {
        return get(Guild.class, "guild/uuid/" + uuid,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public CompletableFuture<Guild> getGuildByPrefix(String prefix) {
        return get(Guild.class, "guild/prefix/" + prefix,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public CompletableFuture<GuildChoicePair> getGuildByName(String name) {
        return get(GuildChoicePair.class, "guild/" + name,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public CompletableFuture<CharacterClass> getCharacterClass(ClassType classType) {
        return get(CharacterClass.class, "classes/" + classType);
    }

    private <T> CompletableFuture<T> get(Class<T> clazz, String request) {
        return get(clazz, request, null);
    }

    private <T> CompletableFuture<T> get(Class<T> clazz, String request, HTTPQueryParams params) {
        String url = BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        return httpClient.makeRequest(url).thenApply(response -> Utilities.GSON.fromJson(response.getBody(), clazz));
    }

}