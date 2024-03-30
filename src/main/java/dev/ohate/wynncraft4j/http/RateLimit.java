package dev.ohate.wynncraft4j.http;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RateLimit {

    private final int remaining;
    private final int reset;
    private final int limit;
    private final Date resetAt;

    public RateLimit(int remaining, int reset, int limit) {
        this.remaining = remaining;
        this.reset = reset;
        this.limit = limit;
        this.resetAt = new Date(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(reset));
    }

    /**
     * Returns the number of requests remaining before the rate limit is reached.
     */
    public int getRemaining() {
        return remaining;
    }

    /**
     * Returns the time in seconds until the rate limit is reset.
     */
    public int getReset() {
        return reset;
    }

    /**
     * Returns the limit on the number of requests that can be made before reaching the rate limit.
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Returns the exact timestamp when the rate limit will be reset.
     */
    public Date getResetAt() {
        return resetAt;
    }

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
