package dev.ohate.wynncraft4j.selection.choice.model;

import java.time.Instant;

public class GuildChoice {

    private String name;
    private String prefix;
    private int level;
    private int members;
    private Instant created;

    /**
     * Returns the guild's name.
     *
     * @return the name of the guild.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the guild's prefix.
     *
     * @return the prefix of the guild.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Returns the guild's level.
     *
     * @return the level of the guild.
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Returns the number of members in the guild.
     *
     * @return the number of members in the guild.
     */
    public int getMembers() {
        return this.members;
    }

    /**
     * Returns the date and time when the guild was created.
     *
     * @return the creation time of the guild as an {@link Instant}.
     */
    public Instant getCreated() {
        return this.created;
    }

    /**
     * Returns a string representation of the guild choice,
     * including the name, prefix, level, members, and creation date.
     *
     * @return a string representation of the {@code GuildChoice}.
     */
    @Override
    public String toString() {
        return "GuildChoice{" +
                "name='" + this.name + '\'' +
                ", prefix='" + this.prefix + '\'' +
                ", level=" + this.level +
                ", members=" + this.members +
                ", created=" + this.created +
                '}';
    }

}
