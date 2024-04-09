package dev.ohate.wynncraft4j;

import dev.ohate.wynncraft4j.api.GuildAPI;
import dev.ohate.wynncraft4j.api.ItemAPI;
import dev.ohate.wynncraft4j.api.PlayerAPI;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.http.impl.DefaultHttpClient;

public class WynncraftAPI {

    public static final String BASE_URL = "https://api.wynncraft.com/v3/";
    public static final String VERSION = "2.1";

    private final WynncraftHttpClient client;
    private final PlayerAPI player;
    private final GuildAPI guild;
    private final ItemAPI item;

    public WynncraftAPI(WynncraftHttpClient client) {
        this.client = client;

        player = new PlayerAPI(client);
        guild = new GuildAPI(client);
        item = new ItemAPI(client);
    }

    public WynncraftAPI() {
        this(new DefaultHttpClient());
    }

    public PlayerAPI player() {
        return player;
    }

    public GuildAPI guild() {
        return guild;
    }

    public ItemAPI item() {
        return item;
    }

    public void shutdown() {
        client.shutdown();
    }

}