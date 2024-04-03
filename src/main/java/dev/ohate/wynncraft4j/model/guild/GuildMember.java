package dev.ohate.wynncraft4j.model.guild;

import java.time.Instant;

public class GuildMember {

    private String username;
    private boolean online;
    private String server;
    private int contributed;
    private int guildRank;
    private Instant joined;

    public String getUsername() {
        return username;
    }

    public boolean isOnline() {
        return online;
    }

    public String getServer() {
        return server;
    }

    public int getContributed() {
        return contributed;
    }

    public int getGuildRank() {
        return guildRank;
    }

    public Instant getJoined() {
        return joined;
    }

    @Override
    public String toString() {
        return "GuildMember{" +
                "username='" + username + '\'' +
                ", online=" + online +
                ", server='" + server + '\'' +
                ", contributed=" + contributed +
                ", guildRank=" + guildRank +
                ", joined='" + joined + '\'' +
                '}';
    }

}
