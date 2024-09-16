package dev.ohate.wynncraft4j.exception;

public class WynncraftException extends RuntimeException {

    private final int statusCode;

    /**
     * Constructs a new WynncraftException with the specified status code, message, and throwable cause.
     *
     * @param statusCode The HTTP status code associated with the error.
     * @param message    The detail message explaining the error.
     * @param throwable  The throwable cause of the error (can be null).
     */
    public WynncraftException(int statusCode, String message, Throwable throwable) {
        super("[" + statusCode + "] " + message, throwable);
        this.statusCode = statusCode;
    }

    /**
     * Constructs a new WynncraftException with the specified status code and message.
     *
     * @param statusCode The HTTP status code associated with the error.
     * @param message    The detail message explaining the error.
     */
    public WynncraftException(int statusCode, String message) {
        this(statusCode, message, null);
    }

    /**
     * Retrieves the HTTP status code associated with this exception.
     *
     * @return The HTTP status code as an integer.
     */
    public int getStatusCode() {
        return statusCode;
    }

}
