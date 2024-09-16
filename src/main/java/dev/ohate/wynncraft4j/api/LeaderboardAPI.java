package dev.ohate.wynncraft4j.api;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.leaderboard.GamemodeLeaderboardEntry;
import dev.ohate.wynncraft4j.model.leaderboard.GuildLeaderboardEntry;
import dev.ohate.wynncraft4j.model.leaderboard.PlayerLeaderboardEntry;
import dev.ohate.wynncraft4j.model.leaderboard.type.GamemodeLeaderboardType;
import dev.ohate.wynncraft4j.model.leaderboard.type.GuildLeaderboardType;
import dev.ohate.wynncraft4j.model.leaderboard.type.PlayerLeaderboardType;

import java.lang.reflect.Type;
import java.util.Map;

public class LeaderboardAPI extends API {

    public static final Type GUILD_LEADERBOARD_MAP_TYPE = new TypeToken<Map<String, GuildLeaderboardEntry>>() {
    }.getType();
    public static final Type PLAYER_LEADERBOARD_MAP_TYPE = new TypeToken<Map<String, PlayerLeaderboardEntry>>() {
    }.getType();
    public static final Type GAMEMODE_LEADERBOARD_MAP_TYPE = new TypeToken<Map<String, GamemodeLeaderboardEntry>>() {
    }.getType();

    /**
     * Constructs a new API instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public LeaderboardAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Retrieves the guild leaderboard data for a specific guild leaderboard type.
     *
     * @param type  The {@link GuildLeaderboardType} to specify which leaderboard to retrieve.
     * @param limit The maximum number of results to return.
     * @return A map of guild leaderboard entries.
     */
    public Map<String, GuildLeaderboardEntry> getGuildLeaderboard(GuildLeaderboardType type, int limit) {
        return get(GUILD_LEADERBOARD_MAP_TYPE, "leaderboards/" + type.getId(),
                HTTPQueryParams.create().add("resultLimit", limit));
    }

    /**
     * Retrieves the player leaderboard data for a specific player leaderboard type.
     *
     * @param type  The {@link PlayerLeaderboardType} to specify which leaderboard to retrieve.
     * @param limit The maximum number of results to return.
     * @return A map of player leaderboard entries.
     */
    public Map<String, PlayerLeaderboardEntry> getPlayerLeaderboard(PlayerLeaderboardType type, int limit) {
        return get(PLAYER_LEADERBOARD_MAP_TYPE, "leaderboards/" + type.getId(),
                HTTPQueryParams.create().add("resultLimit", limit));
    }

    /**
     * Retrieves the gamemode leaderboard data for a specific gamemode leaderboard type.
     *
     * @param type  The {@link GamemodeLeaderboardType} to specify which leaderboard to retrieve.
     * @param limit The maximum number of results to return.
     * @return A map of gamemode leaderboard entries.
     */
    public Map<String, GamemodeLeaderboardEntry> getGamemodeLeaderboard(GamemodeLeaderboardType type, int limit) {
        return get(GAMEMODE_LEADERBOARD_MAP_TYPE, "leaderboards/" + type.getId(),
                HTTPQueryParams.create().add("resultLimit", limit));
    }

}
