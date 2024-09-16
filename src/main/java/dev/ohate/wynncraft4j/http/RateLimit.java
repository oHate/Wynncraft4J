package dev.ohate.wynncraft4j.http;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RateLimit {

    private final int remaining;
    private final int reset;
    private final int limit;
    private final Date resetAt;

    /**
     * Constructs a {@code RateLimit} instance.
     *
     * @param remaining the number of remaining requests before the rate limit is reached.
     * @param reset     the time in seconds until the rate limit is reset.
     * @param limit     the total number of requests allowed before the rate limit is reached.
     */
    public RateLimit(int remaining, int reset, int limit) {
        this.remaining = remaining;
        this.reset = reset;
        this.limit = limit;
        this.resetAt = new Date(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(reset));
    }

    /**
     * Returns the number of requests remaining before the rate limit is reached.
     *
     * @return the remaining number of requests
     */
    public int getRemaining() {
        return remaining;
    }

    /**
     * Returns the time in seconds until the rate limit is reset.
     *
     * @return the number of seconds until the rate limit resets
     */
    public int getReset() {
        return reset;
    }

    /**
     * Returns the limit on the number of requests that can be made before reaching the rate limit.
     *
     * @return the total number of requests allowed before hitting the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Returns the exact timestamp when the rate limit will be reset.
     *
     * @return the {@code Date} object representing when the rate limit will reset
     */
    public Date getResetAt() {
        return resetAt;
    }

    /**
     * Returns a string representation of the {@code RateLimit} object.
     *
     * @return a string containing the limit, remaining requests, reset time in seconds, and the reset timestamp
     */
    @Override
    public String toString() {
        return "RateLimit{" +
                "limit=" + limit +
                ", remaining=" + remaining +
                ", reset=" + reset +
                ", resetAt=" + resetAt +
                '}';
    }

}
