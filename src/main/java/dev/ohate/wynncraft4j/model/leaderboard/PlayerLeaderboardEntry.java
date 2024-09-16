package dev.ohate.wynncraft4j.model.leaderboard;

import com.google.gson.JsonObject;
import dev.ohate.wynncraft4j.model.character.CharacterType;
import dev.ohate.wynncraft4j.model.player.PlayerLegacyRankColour;

import java.util.UUID;

public class PlayerLeaderboardEntry {

    private UUID uuid;
    private String name;
    private int score;
    private int previousRanking;
    private JsonObject metadata;
    private String rank;
    private String rankBadge;
    private String supportRank;
    private PlayerLegacyRankColour legacyRankColour;
    private CharacterType characterType;
    private UUID characterUuid;

    /**
     * Returns the player's UUID.
     *
     * @return the UUID of the player.
     */
    public UUID getUuid() {
        return this.uuid;
    }

    /**
     * Returns the player's name.
     *
     * @return the name of the player.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the player's score in the leaderboard.
     *
     * @return the score of the player.
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Returns the player's previous ranking in the leaderboard.
     *
     * @return the previous ranking of the player.
     */
    public int getPreviousRanking() {
        return this.previousRanking;
    }

    /**
     * Returns additional metadata related to the player.
     *
     * @return a {@link JsonObject} containing the player's metadata.
     */
    public JsonObject getMetadata() {
        return this.metadata;
    }

    /**
     * Returns the player's rank.
     *
     * @return the rank of the player.
     */
    public String getRank() {
        return this.rank;
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
     * Returns the player's support rank.
     *
     * @return the support rank of the player.
     */
    public String getSupportRank() {
        return this.supportRank;
    }

    /**
     * Returns the player's legacy rank color.
     *
     * @return the legacy rank color of the player.
     */
    public PlayerLegacyRankColour getLegacyRankColour() {
        return this.legacyRankColour;
    }

    /**
     * Returns the type of character the player is using.
     *
     * @return the {@link CharacterType} of the player.
     */
    public CharacterType getCharacterType() {
        return this.characterType;
    }

    /**
     * Returns the player's character UUID.
     *
     * @return the UUID of the player's character.
     */
    public UUID getCharacterUuid() {
        return this.characterUuid;
    }

    /**
     * Returns a string representation of the player leaderboard entry,
     * including all relevant player details.
     *
     * @return a string representation of the {@code PlayerLeaderboardEntry}.
     */
    @Override
    public String toString() {
        return "PlayerLeaderboardEntry{" +
                "uuid=" + this.uuid +
                ", name='" + this.name + '\'' +
                ", score=" + this.score +
                ", previousRanking=" + this.previousRanking +
                ", metadata=" + this.metadata +
                ", rank='" + this.rank + '\'' +
                ", rankBadge='" + this.rankBadge + '\'' +
                ", supportRank='" + this.supportRank + '\'' +
                ", legacyRankColour=" + this.legacyRankColour +
                ", characterType=" + this.characterType +
                ", characterUuid=" + this.characterUuid +
                '}';
    }

}
