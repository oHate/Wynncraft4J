package dev.ohate.wynncraft4j.http;

public class WynncraftHttpResponse {

    private final int statusCode;
    private final String body;
    private final RateLimit rateLimit;

    /**
     * Constructs a {@code WynncraftHttpResponse} object.
     *
     * @param statusCode the HTTP status code of the response.
     * @param body       the body of the HTTP response.
     * @param rateLimit  the {@link RateLimit} information associated with the response.
     */
    public WynncraftHttpResponse(int statusCode, String body, RateLimit rateLimit) {
        this.statusCode = statusCode;
        this.body = body;
        this.rateLimit = rateLimit;
    }

    /**
     * Returns the HTTP status code of the response.
     *
     * @return the status code of the response.
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Returns the body of the HTTP response.
     *
     * @return the response body as a {@code String}.
     */
    public String getBody() {
        return body;
    }


    /**
     * Returns the rate limit information associated with the response.
     *
     * @return the {@link RateLimit} object representing rate limit details.
     */
    public RateLimit getRateLimit() {
        return rateLimit;
    }

}
