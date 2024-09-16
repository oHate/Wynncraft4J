package dev.ohate.wynncraft4j.util;

public enum StatusCode {
    OK(200),
    MULTIPLE_CHOICES(300);

    private final int statusCode;

    /**
     * Constructs a new StatusCode enum with the specified HTTP status code.
     *
     * @param statusCode The HTTP status code.
     */
    private StatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Retrieves the HTTP status code associated with this enum.
     *
     * @return The HTTP status code as an integer.
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Checks if the current status code matches the specified status code.
     *
     * @param statusCode the status code to compare with the current status code
     * @return {@code true} if the current status code matches the specified one, otherwise {@code false}
     */
    public boolean is(int statusCode) {
        return this.statusCode == statusCode;
    }

}
