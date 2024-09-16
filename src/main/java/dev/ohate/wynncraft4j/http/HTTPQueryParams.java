package dev.ohate.wynncraft4j.http;

import java.util.HashMap;
import java.util.Map;

public class HTTPQueryParams {

    private final Map<String, Object> params = new HashMap<>();

    /**
     * Private constructor to prevent direct instantiation.
     * Use {@link #create()} to get an instance.
     */
    private HTTPQueryParams() {

    }

    /**
     * Adds a key with a {@code null} value to the query parameters.
     *
     * @param key the key to add.
     * @return the current instance of {@code HTTPQueryParams}.
     */
    public HTTPQueryParams add(String key) {
        return add(key, null);
    }

    /**
     * Adds a key-value pair to the query parameters.
     *
     * @param key   the key to add.
     * @param value the value associated with the key, can be {@code null}.
     * @return the current instance of {@code HTTPQueryParams}.
     */
    public HTTPQueryParams add(String key, Object value) {
        this.params.put(key, value);
        return this;
    }

    /**
     * Converts the query parameters into a query string and appends it to the given base URL.
     *
     * @param base the base URL to which the query string will be appended
     * @return the complete URL with the query string appended
     */
    public String getAsQueryString(String base) {
        StringBuilder url = new StringBuilder(base);
        boolean startedQuery = false;

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (!startedQuery) {
                startedQuery = true;
                url.append("?");
            } else {
                url.append("&");
            }

            url.append(entry.getKey());

            if (entry.getValue() != null) {
                url.append("=").append(entry.getValue());
            }
        }

        return url.toString();
    }

    /**
     * Creates a new instance of {@code HTTPQueryParams}.
     *
     * @return a new instance of {@code HTTPQueryParams}
     */
    public static HTTPQueryParams create() {
        return new HTTPQueryParams();
    }

}
