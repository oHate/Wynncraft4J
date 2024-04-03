package dev.ohate.wynncraft4j.model.choices;

import dev.ohate.wynncraft4j.model.player.PlayerLegacyRankColour;

public class PlayerChoice {

    private String storedName;
    private String rank;
    private boolean veteran;
    private String rankBadge;
    private String supportRank;
    private String shortenedRank;
    private PlayerLegacyRankColour legacyRankColour;

    public String getStoredName() {
        return storedName;
    }

    public String getRank() {
        return rank;
    }

    public boolean isVeteran() {
        return veteran;
    }

    public String getRankBadge() {
        return rankBadge;
    }

    public String getSupportRank() {
        return supportRank;
    }

    public String getShortenedRank() {
        return shortenedRank;
    }

    public PlayerLegacyRankColour getLegacyRankColour() {
        return legacyRankColour;
    }

    @Override
    public String toString() {
        return "PlayerChoice{" +
                "storedName='" + storedName + '\'' +
                ", rank='" + rank + '\'' +
                ", veteran=" + veteran +
                ", rankBadge='" + rankBadge + '\'' +
                ", supportRank='" + supportRank + '\'' +
                ", shortenedRank='" + shortenedRank + '\'' +
                ", legacyRankColour=" + legacyRankColour +
                '}';
    }

}
