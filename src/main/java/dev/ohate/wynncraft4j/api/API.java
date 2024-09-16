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
import dev.ohate.wynncraft4j.util.StatusCode;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;

public class API {

    private final WynncraftHttpClient client;

    /**
     * Constructs a new API instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public API(WynncraftHttpClient client) {
        this.client = client;
    }

    /**
     * Sends a POST request to the specified endpoint with a payload and query parameters.
     *
     * @param clazz   The class of the response object.
     * @param request The API endpoint to send the request to.
     * @param payload The data to be sent in the request body.
     * @param params  The optional query parameters.
     * @return The response object.
     */
    <T> T post(Class<T> clazz, String request, String payload, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, payload, params).getBody(), clazz);
    }

    /**
     * Sends a POST request to the specified endpoint with a payload.
     *
     * @param clazz   The class of the response object.
     * @param request The API endpoint to send the request to.
     * @param payload The data to be sent in the request body.
     * @return The response object.
     */
    <T> T post(Class<T> clazz, String request, String payload) {
        return post(clazz, request, payload, null);
    }

    /**
     * Sends a POST request to the specified endpoint with a payload and query parameters.
     *
     * @param type    The type of the response object.
     * @param request The API endpoint to send the request to.
     * @param payload The data to be sent in the request body.
     * @param params  The optional query parameters.
     * @return The response object.
     */
    <T> T post(Type type, String request, String payload, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, payload, params).getBody(), type);
    }

    /**
     * Sends a POST request to the specified endpoint with a payload.
     *
     * @param <T>     The type of the response object.
     * @param type    The type of the response object.
     * @param request The API endpoint to send the request to.
     * @param payload The data to be sent in the request body.
     * @return The response object.
     */
    <T> T post(Type type, String request, String payload) {
        return post(type, request, payload, null);
    }

    /**
     * Sends a GET request to the specified endpoint with query parameters.
     *
     * @param clazz   The class of the response object.
     * @param request The API endpoint to send the request to.
     * @param params  The optional query parameters.
     * @return The response object.
     */
    <T> T get(Class<T> clazz, String request, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, params).getBody(), clazz);
    }

    /**
     * Sends a GET request to the specified endpoint.
     *
     * @param clazz   The class of the response object.
     * @param request The API endpoint to send the request to.
     * @return The response object.
     */
    <T> T get(Class<T> clazz, String request) {
        return get(clazz, request, null);
    }

    /**
     * Sends a GET request to the specified endpoint with query parameters.
     *
     * @param type    The type of the response object.
     * @param request The API endpoint to send the request to.
     * @param params  The optional query parameters.
     * @return The response object.
     */
    <T> T get(Type type, String request, HTTPQueryParams params) {
        return Utilities.GSON.fromJson(getResponse(request, params).getBody(), type);
    }

    /**
     * Sends a GET request to the specified endpoint.
     *
     * @param type    The type of the response object.
     * @param request The API endpoint to send the request to.
     * @return The response object.
     */
    <T> T get(Type type, String request) {
        return get(type, request, null);
    }

    /**
     * Retrieves the response from the specified POST request.
     *
     * @param request The API endpoint to send the request to.
     * @param payload The data to be sent in the request body.
     * @param params  The optional query parameters.
     * @return The HTTP response.
     */
    WynncraftHttpResponse getResponse(String request, String payload, HTTPQueryParams params) {
        String url = WynncraftAPI.BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        WynncraftHttpResponse response = client.makePostRequest(url, payload);

        validateResponse(response);

        return response;
    }

    /**
     * Retrieves the response from the specified GET request.
     *
     * @param request The API endpoint to send the request to.
     * @param params  The optional query parameters.
     * @return The HTTP response.
     */
    WynncraftHttpResponse getResponse(String request, HTTPQueryParams params) {
        String url = WynncraftAPI.BASE_URL + request;

        if (params != null) {
            url = params.getAsQueryString(url);
        }

        WynncraftHttpResponse response = client.makeGetRequest(url);

        validateResponse(response);

        return response;
    }

    /**
     * Validates the HTTP response by checking the status code and parsing any errors.
     *
     * @param response The HTTP response to validate.
     * @throws WynncraftException if the response contains an error.
     */
    private void validateResponse(WynncraftHttpResponse response) {
        int statusCode = response.getStatusCode();

        if (StatusCode.OK.is(statusCode) || StatusCode.MULTIPLE_CHOICES.is(statusCode)) {
            return;
        }

        String responseBody = response.getBody();

        try {
            JsonObject obj = JsonParser.parseString(responseBody).getAsJsonObject();
            JsonElement err = obj.get("Error");

            throw new WynncraftException(response.getStatusCode(), err.getAsString());
        } catch (JsonSyntaxException | IllegalStateException e) {
            throw new WynncraftException(response.getStatusCode(), "An unknown error has occurred. - " + responseBody, e);
        }
    }

}
