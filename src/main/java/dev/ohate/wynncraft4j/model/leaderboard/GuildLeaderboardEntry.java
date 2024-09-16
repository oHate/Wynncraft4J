package dev.ohate.wynncraft4j.model.leaderboard;

import dev.ohate.wynncraft4j.model.guild.banner.Banner;

import java.time.Instant;
import java.util.UUID;

public class GuildLeaderboardEntry {

    private UUID uuid;
    private String name;
    private String prefix;
    private long xp;
    private int territories;
    private int wars;
    private int level;
    private int members;
    private Instant created;
    private Banner banner;

    /**
     * Returns the guild's UUID.
     *
     * @return the UUID of the guild.
     */
    public UUID getUuid() {
        return this.uuid;
    }

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
     * Returns the total experience (XP) of the guild.
     *
     * @return the experience points of the guild.
     */
    public long getXp() {
        return this.xp;
    }

    /**
     * Returns the number of territories controlled by the guild.
     *
     * @return the number of territories owned by the guild.
     */
    public int getTerritories() {
        return this.territories;
    }

    /**
     * Returns the number of wars the guild has participated in.
     *
     * @return the number of wars the guild has fought.
     */
    public int getWars() {
        return this.wars;
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
     * @return the number of guild members.
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
     * Returns the guild's banner.
     *
     * @return the {@link Banner} associated with the guild.
     */
    public Banner getBanner() {
        return this.banner;
    }

    /**
     * Returns a string representation of the guild leaderboard entry,
     * including all relevant guild details.
     *
     * @return a string representation of the {@code GuildLeaderboardEntry}.
     */
    @Override
    public String toString() {
        return "GuildLeaderboardEntry{" +
                "uuid=" + this.uuid +
                ", name='" + this.name + '\'' +
                ", prefix='" + this.prefix + '\'' +
                ", xp=" + this.xp +
                ", territories=" + this.territories +
                ", wars=" + this.wars +
                ", level=" + this.level +
                ", members=" + this.members +
                ", created=" + this.created +
                ", banner=" + this.banner +
                '}';
    }

}
