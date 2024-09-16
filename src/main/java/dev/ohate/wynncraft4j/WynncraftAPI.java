package dev.ohate.wynncraft4j;

import dev.ohate.wynncraft4j.api.*;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.http.impl.DefaultHttpClient;

public class WynncraftAPI {

    public static final String BASE_URL = "https://api.wynncraft.com/v3/";
    public static final String VERSION = "2.2";

    private final WynncraftHttpClient client;
    private final PlayerAPI player;
    private final GuildAPI guild;
    private final ItemAPI item;
    private final LeaderboardAPI leaderboard;
    // Ability
    private final MapAPI map;
    private final SearchAPI search;
    private final ClassesAPI classes;

    /**
     * Constructs a {@code WynncraftAPI} instance with the specified HTTP client.
     *
     * @param client the HTTP client to use for making API requests
     */
    public WynncraftAPI(WynncraftHttpClient client) {
        this.client = client;
        this.player = new PlayerAPI(client);
        this.guild = new GuildAPI(client);
        this.item = new ItemAPI(client);
        this.leaderboard = new LeaderboardAPI(client);
        this.classes = new ClassesAPI(client);
        this.search = new SearchAPI(client);
        this.map = new MapAPI(client);
    }

    /**
     * Constructs a {@code WynncraftAPI} instance using the default HTTP client.
     */
    public WynncraftAPI() {
        this(new DefaultHttpClient());
    }

    /**
     * Provides access to the Player API.
     *
     * @return an instance of {@link PlayerAPI} for player-related API calls
     */
    public PlayerAPI player() {
        return this.player;
    }

    /**
     * Provides access to the Guild API.
     *
     * @return an instance of {@link GuildAPI} for guild-related API calls
     */
    public GuildAPI guild() {
        return this.guild;
    }

    /**
     * Provides access to the Item API.
     *
     * @return an instance of {@link ItemAPI} for item-related API calls
     */
    public ItemAPI item() {
        return this.item;
    }

    /**
     * Provides access to the Leaderboard API.
     *
     * @return an instance of {@link LeaderboardAPI} for leaderboard-related API calls
     */
    public LeaderboardAPI leaderboard() {
        return this.leaderboard;
    }

    /**
     * Provides access to the Map API.
     *
     * @return an instance of {@link MapAPI} for map-related API calls
     */
    public MapAPI map() {
        return this.map;
    }

    /**
     * Provides access to the Search API.
     *
     * @return an instance of {@link SearchAPI} for search-related API calls
     */
    public SearchAPI search() {
        return this.search;
    }

    /**
     * Provides access to the Classes API.
     *
     * @return an instance of {@link ClassesAPI} for class-related API calls
     */
    public ClassesAPI classes() {
        return this.classes;
    }

    /**
     * Shuts down the HTTP client, terminating any ongoing API calls and releasing resources.
     */
    public void shutdown() {
        this.client.shutdown();
    }

}