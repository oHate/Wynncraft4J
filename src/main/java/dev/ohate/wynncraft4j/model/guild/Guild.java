package dev.ohate.wynncraft4j.model.guild;

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
    private GuildBanner banner;
    private Map<String, GuildSeasonRank> seasonRanks;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getLevel() {
        return level;
    }

    public int getXpPercent() {
        return xpPercent;
    }

    public int getTerritories() {
        return territories;
    }

    public int getWars() {
        return wars;
    }

    public Instant getCreated() {
        return created;
    }

    public GuildMembers getMembers() {
        return members;
    }

    public int getOnline() {
        return online;
    }

    public GuildBanner getBanner() {
        return banner;
    }

    public Map<String, GuildSeasonRank> getSeasonRanks() {
        return seasonRanks;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", level=" + level +
                ", xpPercent=" + xpPercent +
                ", territories=" + territories +
                ", wars=" + wars +
                ", created='" + created + '\'' +
                ", members=" + members +
                ", online=" + online +
                ", banner=" + banner +
                ", seasonRanks=" + seasonRanks +
                '}';
    }

}
