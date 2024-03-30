package dev.ohate.wynncraft4j.model.player;

import dev.ohate.wynncraft4j.model.player.global.PlayerGlobalData;

import java.util.Map;

public class Player {

    private String username;
    private boolean online;
    private String server;
    // Nullable
    private String activeCharacter;
    private String uuid;
    private String rank;
    private String rankBadge;
    private PlayerLegacyRankColour legacyRankColour;
    private String shortenedRank;
    private String supportRank;
    private boolean veteran;
    private String firstJoin;
    private String lastJoin;
    // Docs specify this type as a int instead of a double
    private double playtime;
    //    private Guild guild;
    private PlayerGlobalData globalData;
    // Nullable/Doesn't work sometimes
    private Integer forumLink;
    private Map<String, Integer> ranking;
    private boolean publicProfile;
    // Nullable
    //    private Map<String, CharacterData> characters;

    public String getUsername() {
        return username;
    }

    public boolean isOnline() {
        return online;
    }

    public String getServer() {
        return server;
    }

    public String getActiveCharacter() {
        return activeCharacter;
    }

    public String getUuid() {
        return uuid;
    }

    public String getRank() {
        return rank;
    }

    public String getRankBadge() {
        return rankBadge;
    }

    public PlayerLegacyRankColour getLegacyRankColour() {
        return legacyRankColour;
    }

    public String getShortenedRank() {
        return shortenedRank;
    }

    public String getSupportRank() {
        return supportRank;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public String getFirstJoin() {
        return firstJoin;
    }

    public String getLastJoin() {
        return lastJoin;
    }

    public double getPlaytime() {
        return playtime;
    }

    public PlayerGlobalData getGlobalData() {
        return globalData;
    }

    public Integer getForumLink() {
        return forumLink;
    }

    public Map<String, Integer> getRanking() {
        return ranking;
    }

    public boolean isPublicProfile() {
        return publicProfile;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", online=" + online +
                ", server='" + server + '\'' +
                ", activeCharacter='" + activeCharacter + '\'' +
                ", uuid='" + uuid + '\'' +
                ", rank='" + rank + '\'' +
                ", rankBadge='" + rankBadge + '\'' +
                ", legacyRankColour=" + legacyRankColour +
                ", shortenedRank='" + shortenedRank + '\'' +
                ", supportRank='" + supportRank + '\'' +
                ", veteran=" + veteran +
                ", firstJoin='" + firstJoin + '\'' +
                ", lastJoin='" + lastJoin + '\'' +
                ", playtime=" + playtime +
                ", globalData=" + globalData +
                ", forumLink=" + forumLink +
                ", ranking=" + ranking +
                ", publicProfile=" + publicProfile +
                '}';
    }

}
