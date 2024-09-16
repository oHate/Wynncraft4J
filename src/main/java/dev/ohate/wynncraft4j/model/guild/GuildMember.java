package dev.ohate.wynncraft4j.model.guild;

import java.time.Instant;
import java.util.UUID;

public class GuildMember {

    private UUID uuid;
    private String username;
    private boolean online;
    private String server;
    private long contributed;
    private int contributionRank;
    private Instant joined;

    /**
     * Returns the UUID of the guild member.
     *
     * @return the UUID of the guild member.
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Returns the username of the guild member.
     *
     * @return the username of the guild member.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns whether the guild member is currently online.
     *
     * @return {@code true} if the member is online, {@code false} otherwise.
     */
    public boolean isOnline() {
        return this.online;
    }

    /**
     * Returns the server on which the guild member is currently playing.
     *
     * @return the name of the server.
     */
    public String getServer() {
        return this.server;
    }

    /**
     * Returns the total amount of XP the guild member has contributed.
     *
     * @return the total amount of XP the guild member has contributed.
     */
    public long getContributed() {
        return this.contributed;
    }

    /**
     * Returns the contribution rank of the guild member.
     *
     * @return the contribution rank of the guild member.
     */
    public int getContributionRank() {
        return this.contributionRank;
    }

    /**
     * Returns the date and time when the guild member joined the guild.
     *
     * @return the {@link Instant} representing the join date and time.
     */
    public Instant getJoined() {
        return this.joined;
    }

    /**
     * Returns a string representation of the {@code GuildMember} object.
     * This includes the username, online status, server, contribution points, guild rank, and join date.
     *
     * @return a {@code String} containing all the details of the guild member.
     */
    @Override
    public String toString() {
        return "GuildMember{" +
                "uuid='" + this.uuid + '\'' +
                ", username='" + this.username + '\'' +
                ", online=" + this.online +
                ", server='" + this.server + '\'' +
                ", contributed=" + this.contributed +
                ", contributionRank=" + this.contributionRank +
                ", joined='" + this.joined + '\'' +
                '}';
    }

}