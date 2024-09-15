package dev.ohate.wynncraft4j.model.search;

import java.util.UUID;

public class PlayerSearchResult {

    private UUID uuid;
    private String username;

    /**
     * Gets the UUID of the player.
     *
     * @return the UUID of the player.
     */
    public UUID getUuid() {
        return this.uuid;
    }

    /**
     * Gets the username of the player.
     *
     * @return the username of the player.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns a string representation of the PlayerSearchResult.
     * The string includes the UUID and username of the player.
     *
     * @return a string representation of the PlayerSearchResult.
     */
    @Override
    public String toString() {
        return "PlayerSearchResult{" +
                "uuid=" + this.uuid +
                ", username='" + this.username + '\'' +
                '}';
    }

}
