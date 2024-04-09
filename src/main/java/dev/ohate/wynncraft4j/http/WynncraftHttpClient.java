package dev.ohate.wynncraft4j.http;

import dev.ohate.wynncraft4j.WynncraftAPI;

public interface WynncraftHttpClient {

    String DEFAULT_USER_AGENT = "Wynncraft4J/" + WynncraftAPI.VERSION;

    WynncraftHttpResponse makeRequest(String url);

    void shutdown();

}
