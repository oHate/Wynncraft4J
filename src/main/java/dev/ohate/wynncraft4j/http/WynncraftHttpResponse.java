package dev.ohate.wynncraft4j.http;

public class WynncraftHttpResponse {

    private final int statusCode;
    private final String body;
    private final RateLimit rateLimit;

    public WynncraftHttpResponse(int statusCode, String body, RateLimit rateLimit) {
        this.statusCode = statusCode;
        this.body = body;
        this.rateLimit = rateLimit;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

}
