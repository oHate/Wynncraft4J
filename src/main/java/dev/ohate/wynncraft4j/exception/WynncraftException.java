package dev.ohate.wynncraft4j.exception;

public class WynncraftException extends RuntimeException {

    private final int statusCode;

    public WynncraftException(int statusCode, String message, Throwable throwable) {
        super(message, throwable);
        this.statusCode = statusCode;
    }

    public WynncraftException(int statusCode, String message) {
        this(statusCode, message, null);
    }

    public int getStatusCode() {
        return statusCode;
    }

}
