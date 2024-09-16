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

    /**
     * Returns the unique identifier (UUID) of the player.
     *
     * @return The player's UUID.
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Returns the username of the player.
     *
     * @return The player's username.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns whether the player is currently online.
     *
     * @return {@code true} if the player is online, {@code false} otherwise.
     */
    public boolean isOnline() {
        return this.online;
    }

    /**
     * Returns the server the player is currently on.
     *
     * @return The server name.
     */
    public String getServer() {
        return this.server;
    }

    /**
     * Returns the total playtime of the player in hours.
     *
     * @return The player's playtime.
     */
    public double getPlaytime() {
        return this.playtime;
    }

    /**
     * Returns the timestamp of when the player first joined the game.
     *
     * @return The timestamp of the player's first join.
     */
    public Instant getFirstJoin() {
        return this.firstJoin;
    }

    /**
     * Returns the timestamp of when the player last joined the game.
     *
     * @return The timestamp of the player's last join.
     */
    public Instant getLastJoin() {
        return this.lastJoin;
    }

    /**
     * Returns the rank of the player.
     *
     * @return The player's rank.
     */
    public String getRank() {
        return this.rank;
    }

    /**
     * Returns the shortened version of the player's rank.
     *
     * @return The shortened rank.
     */
    public String getShortenedRank() {
        return this.shortenedRank;
    }

    /**
     * Returns the support rank of the player.
     *
     * @return The player's support rank.
     */
    public String getSupportRank() {
        return this.supportRank;
    }

    /**
     * Returns the badge associated with the player's rank.
     *
     * @return The player's rank badge.
     */
    public String getRankBadge() {
        return this.rankBadge;
    }

    /**
     * Returns the legacy rank colour associated with the player.
     *
     * @return The player's legacy rank colour.
     */
    public PlayerLegacyRankColour getLegacyRankColour() {
        return this.legacyRankColour;
    }

    /**
     * Returns the guild associated with the player.
     *
     * @return The player's guild.
     */
    public PlayerGuild getGuild() {
        return this.guild;
    }

    /**
     * Returns the global data related to the player.
     *
     * @return The player's global data.
     */
    public PlayerGlobalData getGlobalData() {
        return this.globalData;
    }

    /**
     * Returns the player's ranking in various categories.
     *
     * @return A map of ranking categories and their respective ranks.
     */
    public Map<String, Integer> getRanking() {
        return this.ranking;
    }

    /**
     * Returns whether the player is a veteran.
     *
     * @return {@code true} if the player is a veteran, {@code false} otherwise.
     */
    public boolean isVeteran() {
        return this.veteran;
    }

    /**
     * Returns whether the player's profile is public.
     *
     * @return {@code true} if the profile is public, {@code false} otherwise.
     */
    public boolean isPublicProfile() {
        return this.publicProfile;
    }

    /**
     * Returns the forum link associated with the player.
     *
     * @return The forum link, or {@code null} if not available.
     */
    public Integer getForumLink() {
        return this.forumLink;
    }

    /**
     * Returns the identifier of the player's active character.
     *
     * @return The active character identifier.
     */
    public String getActiveCharacter() {
        return this.activeCharacter;
    }

    /**
     * Returns a map of the player's characters.
     * If no characters are available, returns an empty map.
     *
     * @return A map of the player's characters.
     */
    public Map<UUID, PlayerCharacter> getCharacters() {
        return this.characters == null ? Collections.emptyMap() : characters;
    }

    /**
     * Returns the player's rank as a {@code PlayerRank} enum.
     * If the rank is "Player" and a support rank is provided, it uses the support rank.
     * Otherwise, it uses the main rank.
     *
     * @return The player's rank.
     */
    public PlayerRank getPlayerRank() {
        return PlayerRank.fromString(rank.equals("Player") && this.supportRank != null ? this.supportRank : this.rank);
    }

    /**
     * Returns a formatted ranking for a given type.
     * If the ranking data is not available or the rank is not found, returns "N/A".
     *
     * @param type The type of ranking to format.
     * @return The formatted ranking string.
     */
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

    /**
     * Returns a string representation of the {@code Player} object.
     *
     * @return A string representation of the player.
     */
    @Override
    public String toString() {
        return "Player{" +
                "uuid='" + this.uuid + '\'' +
                ", username='" + this.username + '\'' +
                ", online=" + this.online +
                ", server='" + this.server + '\'' +
                ", playtime=" + this.playtime +
                ", firstJoin=" + this.firstJoin +
                ", lastJoin=" + this.lastJoin +
                ", rank='" + this.rank + '\'' +
                ", shortenedRank='" + this.shortenedRank + '\'' +
                ", supportRank='" + this.supportRank + '\'' +
                ", rankBadge='" + this.rankBadge + '\'' +
                ", legacyRankColour=" + this.legacyRankColour +
                ", guild=" + this.guild +
                ", globalData=" + this.globalData +
                ", ranking=" + this.ranking +
                ", veteran=" + this.veteran +
                ", publicProfile=" + this.publicProfile +
                ", forumLink=" + this.forumLink +
                ", activeCharacter='" + this.activeCharacter + '\'' +
                ", characters=" + this.characters +
                '}';
    }

}
