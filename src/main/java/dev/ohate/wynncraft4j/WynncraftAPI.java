package dev.ohate.wynncraft4j;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import dev.ohate.wynncraft4j.exception.WynncraftException;
import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.http.impl.DefaultHttpClient;
import dev.ohate.wynncraft4j.model.character.CharacterClass;
import dev.ohate.wynncraft4j.model.character.CharacterEntry;
import dev.ohate.wynncraft4j.model.character.CharacterType;
import dev.ohate.wynncraft4j.model.choices.guild.GuildSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerAbilitiesSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerCharacterListSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerCharacterSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerSelection;
import dev.ohate.wynncraft4j.model.guild.Guild;
import dev.ohate.wynncraft4j.model.guild.SimpleGuild;
import dev.ohate.wynncraft4j.model.guild.territory.GuildTerritory;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.model.player.abilities.PlayerAbilities;
import dev.ohate.wynncraft4j.model.player.character.PlayerCharacter;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class WynncraftAPI {

    public static final String BASE_URL = "https://api.wynncraft.com/v3/";
    public static final String VERSION = "2.0";

    private final WynncraftHttpClient httpClient;

    public WynncraftAPI() {
        this.httpClient = new DefaultHttpClient();
    }

    public WynncraftAPI(WynncraftHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void shutdown() {
        httpClient.shutdown();
    }

    public Player getPlayer(UUID playerId, boolean fullResult) {
        return getPlayer(playerId.toString(), fullResult).getPlayer();
    }

    public PlayerSelection getPlayer(String username, boolean fullResult) {
        return PlayerSelection.fromResponse(getResponse("player/" + username,
                fullResult ? HTTPQueryParams.create().add("fullResult", "True") : null));
    }

    public Map<UUID, CharacterEntry> getPlayerCharacters(UUID playerId) {
        return getPlayerCharacters(playerId.toString()).getCharacters();
    }

    public PlayerCharacterListSelection getPlayerCharacters(String username) {
        return PlayerCharacterListSelection.fromResponse(
                getResponse("player/" + username + "/characters", null)
        );
    }

    public PlayerCharacter getPlayerCharacter(UUID playerId, UUID characterId) {
        return getPlayerCharacter(playerId.toString(), characterId).getCharacter();
    }

    public PlayerCharacterSelection getPlayerCharacter(String username, UUID characterId) {
        return PlayerCharacterSelection.fromResponse(
                getResponse("player/" + username + "/characters/" + characterId.toString(), null)
        );
    }

    public PlayerAbilities getPlayerAbilities(UUID playerId, UUID characterId) {
        return getPlayerAbilities(playerId.toString(), characterId).getAbilities();
    }

    public PlayerAbilitiesSelection getPlayerAbilities(String username, UUID characterId) {
        return PlayerAbilitiesSelection.fromResponse(
                getResponse("player/" + username + "/characters/" + characterId, null)
        );
    }

    public Guild getGuild(UUID uuid) {
        return get(Guild.class, "guild/uuid/" + uuid,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public Guild getGuildByPrefix(String prefix) {
        return get(Guild.class, "guild/prefix/" + prefix,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public GuildSelection getGuildByName(String name) {
        return GuildSelection.fromResponse(
                getResponse("guild/" + name, HTTPQueryParams.create().add("identifier", "uuid"))
        );
    }

    public Map<UUID, SimpleGuild> getGuildList() {
        return get(SimpleGuild.GUILD_MAP_TYPE, "guild/list/guild",
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public Map<String, GuildTerritory> getGuildTerritoryList() {
        return get(GuildTerritory.TERRITORY_MAP_TYPE, "guild/list/territory",
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public CharacterClass getCharacterClass(CharacterType characterType) {
        return get(CharacterClass.class, "classes/" + characterType);
    }

    private <T> T get(Class<T> clazz, String request) {
        return get(clazz, request, null);
    }

    private <T> T get(Class<T> clazz, String request, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, params).getBody(), clazz);
    }

    private <T> T get(Type type, String request) {
        return Utilities.GSON.fromJson(getResponse(request, null).getBody(), type);
    }

    private <T> T get(Type type, String request, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, params).getBody(), type);
    }

    private WynncraftHttpResponse getResponse(String request, HTTPQueryParams params) {
        String url = BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        WynncraftHttpResponse response = httpClient.makeRequest(url);

        if (response.getStatusCode() != 200 && response.getStatusCode() != 300) {
            String responseBody = response.getBody();

            try {
                JsonObject obj = JsonParser.parseString(responseBody).getAsJsonObject();
                JsonElement err = obj.get("Error");

                throw new WynncraftException(response.getStatusCode(), err.getAsString());
            } catch (JsonSyntaxException | IllegalStateException e) {
                throw new WynncraftException(response.getStatusCode(), "An unknown error has occurred.", e);
            }
        }

        return response;
    }

}