package dev.ohate.wynncraft4j.model.player;

public class PlayerGuild {

    private String name;
    private String prefix;
    private String rank;
    private String rankStars;

    /**
     * Returns the name of the guild.
     *
     * @return The guild's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the prefix associated with the guild.
     *
     * @return The guild's prefix.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Returns the rank of the player within the guild.
     *
     * @return The player's rank within the guild.
     */
    public String getRank() {
        return this.rank;
    }

    /**
     * Returns the rank stars associated with the player's guild rank.
     *
     * @return The rank stars of the player's guild rank.
     */
    public String getRankStars() {
        return this.rankStars;
    }

    /**
     * Returns a string representation of the {@code PlayerGuild} object.
     *
     * @return A string representation of the guild.
     */
    @Override
    public String toString() {
        return "PlayerGuild{" +
                "name='" + this.name + '\'' +
                ", prefix='" + this.prefix + '\'' +
                ", rank='" + this.rank + '\'' +
                ", rankStars='" + this.rankStars + '\'' +
                '}';
    }

}
