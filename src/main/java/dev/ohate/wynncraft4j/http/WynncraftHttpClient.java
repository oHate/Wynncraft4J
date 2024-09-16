package dev.ohate.wynncraft4j.http;

import dev.ohate.wynncraft4j.WynncraftAPI;

public interface WynncraftHttpClient {

    /**
     * Default User-Agent string used for HTTP requests.
     */
    String DEFAULT_USER_AGENT = "Wynncraft4J/" + WynncraftAPI.VERSION;

    /**
     * Makes an HTTP GET request to the specified URL.
     *
     * @param url the URL to send the GET request to.
     * @return a {@link WynncraftHttpResponse} containing the response of the request.
     */
    WynncraftHttpResponse makeGetRequest(String url);

    /**
     * Makes an HTTP POST request to the specified URL with the provided payload.
     *
     * @param url     the URL to send the POST request to.
     * @param payload the data to send as the body of the POST request.
     * @return a {@link WynncraftHttpResponse} containing the response of the request.
     */
    WynncraftHttpResponse makePostRequest(String url, String payload);

    /**
     * Shuts down the HTTP client.
     */
    void shutdown();

}
