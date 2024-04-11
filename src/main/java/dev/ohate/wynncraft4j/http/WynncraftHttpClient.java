package dev.ohate.wynncraft4j.http;

import dev.ohate.wynncraft4j.WynncraftAPI;

public interface WynncraftHttpClient {

    String DEFAULT_USER_AGENT = "Wynncraft4J/" + WynncraftAPI.VERSION;

    WynncraftHttpResponse makeGETRequest(String url);
    WynncraftHttpResponse makePOSTRequest(String url, String payload);

    void shutdown();

}
