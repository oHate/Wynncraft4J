package dev.ohate.wynncraft4j.model.guild;

import dev.ohate.wynncraft4j.model.guild.banner.Banner;

import java.time.Instant;
import java.util.Map;

public class Guild {

    private String uuid;
    private String name;
    private String prefix;
    private int level;
    private int xpPercent;
    private int territories;
    private int wars;
    private Instant created;
    private GuildMembers members;
    private int online;
    private Banner banner;
    private Map<String, GuildSeasonRank> seasonRanks;

    /**
     * Returns the unique identifier of the guild.
     *
     * @return the UUID of the guild.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Returns the name of the guild.
     *
     * @return the name of the guild.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the prefix used for the guild.
     *
     * @return the guild prefix.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Returns the level of the guild.
     *
     * @return the level of the guild.
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Returns the experience percentage of the guild.
     *
     * @return the XP percentage of the guild.
     */
    public int getXpPercent() {
        return this.xpPercent;
    }

    /**
     * Returns the number of territories controlled by the guild.
     *
     * @return the number of territories.
     */
    public int getTerritories() {
        return this.territories;
    }

    /**
     * Returns the number of wars the guild has participated in.
     *
     * @return the number of wars.
     */
    public int getWars() {
        return this.wars;
    }

    /**
     * Returns the creation date of the guild.
     *
     * @return the {@link Instant} representing the guild's creation date.
     */
    public Instant getCreated() {
        return this.created;
    }

    /**
     * Returns the members of the guild.
     *
     * @return the {@link GuildMembers} object representing the guild's members.
     */
    public GuildMembers getMembers() {
        return this.members;
    }

    /**
     * Returns the number of online members in the guild.
     *
     * @return the number of online members.
     */
    public int getOnline() {
        return this.online;
    }

    /**
     * Returns the banner of the guild.
     *
     * @return the {@link Banner} object representing the guild's banner.
     */
    public Banner getBanner() {
        return this.banner;
    }

    /**
     * Returns the seasonal ranks of the guild.
     * The ranks are represented as a map where the key is the season identifier and the value is the {@link GuildSeasonRank}.
     *
     * @return a map of seasonal ranks.
     */
    public Map<String, GuildSeasonRank> getSeasonRanks() {
        return this.seasonRanks;
    }

    /**
     * Returns a string representation of the {@code Guild} object.
     *
     * @return a {@code String} containing all the details of the guild.
     */
    @Override
    public String toString() {
        return "Guild{" +
                "uuid='" + this.uuid + '\'' +
                ", name='" + this.name + '\'' +
                ", prefix='" + this.prefix + '\'' +
                ", level=" + this.level +
                ", xpPercent=" + this.xpPercent +
                ", territories=" + this.territories +
                ", wars=" + this.wars +
                ", created='" + this.created + '\'' +
                ", members=" + this.members +
                ", online=" + this.online +
                ", banner=" + this.banner +
                ", seasonRanks=" + this.seasonRanks +
                '}';
    }

}
