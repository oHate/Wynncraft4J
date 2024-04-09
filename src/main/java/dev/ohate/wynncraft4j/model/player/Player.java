package dev.ohate.wynncraft4j.model.player;

import dev.ohate.wynncraft4j.model.player.character.PlayerCharacter;
import dev.ohate.wynncraft4j.model.player.global.PlayerGlobalData;

import java.text.NumberFormat;
import java.time.Instant;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class Player {

    private String uuid;
    private String username;
    private boolean online;
    private String server;
    private double playtime;
    private Instant firstJoin;
    private Instant lastJoin;
    private String rank;
    private String shortenedRank;
    private String supportRank;
    private String rankBadge;
    private PlayerLegacyRankColour legacyRankColour;
    private PlayerGuild guild;
    private PlayerGlobalData globalData;
    private Map<String, Integer> ranking;
    private boolean veteran;
    private boolean publicProfile;
    private Integer forumLink;
    private String activeCharacter;
    private Map<UUID, PlayerCharacter> characters;

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isOnline() {
        return online;
    }

    public String getServer() {
        return server;
    }

    public double getPlaytime() {
        return playtime;
    }

    public Instant getFirstJoin() {
        return firstJoin;
    }

    public Instant getLastJoin() {
        return lastJoin;
    }

    public String getRank() {
        return rank;
    }

    public String getShortenedRank() {
        return shortenedRank;
    }

    public String getSupportRank() {
        return supportRank;
    }

    public String getRankBadge() {
        return rankBadge;
    }

    public PlayerLegacyRankColour getLegacyRankColour() {
        return legacyRankColour;
    }

    public PlayerGuild getGuild() {
        return guild;
    }

    public PlayerGlobalData getGlobalData() {
        return globalData;
    }

    public Map<String, Integer> getRanking() {
        return ranking;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public boolean isPublicProfile() {
        return publicProfile;
    }

    public Integer getForumLink() {
        return forumLink;
    }

    public String getActiveCharacter() {
        return activeCharacter;
    }

    public Map<UUID, PlayerCharacter> getCharacters() {
        return characters == null ? Collections.emptyMap() : characters;
    }

    public PlayerRank getPlayerRank() {
        return PlayerRank.fromString(rank.equals("Player") && supportRank != null ? supportRank : rank);
    }

    public String getFormattedRanking(String type) {
        if (ranking == null) {
            return "N/A";
        }

        Integer rank = ranking.get(type);

        if (rank == null) {
            return "N/A";
        }

        return "#" + NumberFormat.getNumberInstance(Locale.US).format(rank + 1);
    }

    @Override
    public String toString() {
        return "Player{" +
                "uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                ", online=" + online +
                ", server='" + server + '\'' +
                ", playtime=" + playtime +
                ", firstJoin=" + firstJoin +
                ", lastJoin=" + lastJoin +
                ", rank='" + rank + '\'' +
                ", shortenedRank='" + shortenedRank + '\'' +
                ", supportRank='" + supportRank + '\'' +
                ", rankBadge='" + rankBadge + '\'' +
                ", legacyRankColour=" + legacyRankColour +
                ", guild=" + guild +
                ", globalData=" + globalData +
                ", ranking=" + ranking +
                ", veteran=" + veteran +
                ", publicProfile=" + publicProfile +
                ", forumLink=" + forumLink +
                ", activeCharacter='" + activeCharacter + '\'' +
                ", characters=" + characters +
                '}';
    }

}
