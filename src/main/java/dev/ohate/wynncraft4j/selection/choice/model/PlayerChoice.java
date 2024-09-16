package dev.ohate.wynncraft4j.selection.choice.model;

import dev.ohate.wynncraft4j.model.player.PlayerLegacyRankColour;
import dev.ohate.wynncraft4j.model.player.PlayerRank;

public class PlayerChoice {

    private String storedName;
    private String rank;
    private boolean veteran;
    private String rankBadge;
    private String supportRank;
    private String shortenedRank;
    private PlayerLegacyRankColour legacyRankColour;

    /**
     * Returns the stored name of the player.
     *
     * @return the player's stored name.
     */
    public String getStoredName() {
        return this.storedName;
    }

    /**
     * Returns the rank of the player.
     *
     * @return the player's rank.
     */
    public String getRank() {
        return this.rank;
    }

    /**
     * Checks if the player has veteran status.
     *
     * @return {@code true} if the player is a veteran, {@code false} otherwise.
     */
    public boolean isVeteran() {
        return this.veteran;
    }

    /**
     * Returns the player's rank badge.
     *
     * @return the rank badge of the player.
     */
    public String getRankBadge() {
        return this.rankBadge;
    }

    /**
     * Returns the player's support rank, if any.
     *
     * @return the player's support rank, or {@code null} if none exists.
     */
    public String getSupportRank() {
        return this.supportRank;
    }

    /**
     * Returns the shortened version of the player's rank.
     *
     * @return the shortened rank.
     */
    public String getShortenedRank() {
        return this.shortenedRank;
    }

    /**
     * Returns the legacy rank color of the player.
     *
     * @return the player's legacy rank color.
     */
    public PlayerLegacyRankColour getLegacyRankColour() {
        return this.legacyRankColour;
    }

    /**
     * Returns the player's rank as a {@link PlayerRank} instance, converting the stored rank
     * and support rank to the appropriate rank.
     *
     * @return the player's {@link PlayerRank}.
     */
    public PlayerRank getPlayerRank() {
        return PlayerRank.fromString(this.rank.equalsIgnoreCase("Player") && this.supportRank != null ? this.supportRank : this.rank);
    }

    /**
     * Returns a string representation of the {@code PlayerChoice} object, including the stored
     * name, rank, veteran status, rank badge, support rank, shortened rank, and legacy rank color.
     *
     * @return a string representation of the {@code PlayerChoice} object.
     */
    @Override
    public String toString() {
        return "PlayerChoice{" +
                "storedName='" + this.storedName + '\'' +
                ", rank='" + this.rank + '\'' +
                ", veteran=" + this.veteran +
                ", rankBadge='" + this.rankBadge + '\'' +
                ", supportRank='" + this.supportRank + '\'' +
                ", shortenedRank='" + this.shortenedRank + '\'' +
                ", legacyRankColour=" + this.legacyRankColour +
                '}';
    }

}
