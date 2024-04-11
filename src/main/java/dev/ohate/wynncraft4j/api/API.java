package dev.ohate.wynncraft4j.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import dev.ohate.wynncraft4j.WynncraftAPI;
import dev.ohate.wynncraft4j.exception.WynncraftException;
import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;

public class API {

    private final WynncraftHttpClient client;

    public API(WynncraftHttpClient client) {
        this.client = client;
    }

    <T> T post(Class<T> clazz, String request, String payload, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, payload, params).getBody(), clazz);
    }

    <T> T post(Class<T> clazz, String request, String payload) {
        return post(clazz, request, payload, null);
    }

    <T> T post(Type type, String request, String payload, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, payload, params).getBody(), type);
    }

    <T> T post(Type type, String request, String payload) {
        return post(type, request, payload, null);
    }

    <T> T get(Class<T> clazz, String request, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, params).getBody(), clazz);
    }

    <T> T get(Class<T> clazz, String request) {
        return get(clazz, request, null);
    }

    <T> T get(Type type, String request, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, params).getBody(), type);
    }

    <T> T get(Type type, String request) {
        return get(type, request, null);
    }

    WynncraftHttpResponse getResponse(String request, String payload, HTTPQueryParams params) {
        String url = WynncraftAPI.BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        WynncraftHttpResponse response = client.makePOSTRequest(url, payload);

        validateResponse(response);

        return response;
    }

    WynncraftHttpResponse getResponse(String request, HTTPQueryParams params) {
        String url = WynncraftAPI.BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        WynncraftHttpResponse response = client.makeGETRequest(url);

        validateResponse(response);

        return response;
    }

    private void validateResponse(WynncraftHttpResponse response) {
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
    }

}
