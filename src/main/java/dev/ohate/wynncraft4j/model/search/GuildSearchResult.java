package dev.ohate.wynncraft4j.model.search;

import java.util.UUID;

public class GuildSearchResult {

    private UUID uuid;
    private String name;
    private String prefix;

    /**
     * Gets the UUID of the guild.
     *
     * @return the UUID of the guild.
     */
    public UUID getUuid() {
        return this.uuid;
    }

    /**
     * Gets the name of the guild.
     *
     * @return the name of the guild.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the prefix of the guild.
     *
     * @return the prefix of the guild.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Returns a string representation of the GuildSearchResult.
     * The string includes the UUID, name, and prefix of the guild.
     *
     * @return a string representation of the GuildSearchResult.
     */
    @Override
    public String toString() {
        return "GuildSearchResult{" +
                "uuid=" + this.uuid +
                ", name='" + this.name + '\'' +
                ", prefix='" + this.prefix + '\'' +
                '}';
    }

}
