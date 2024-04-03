package dev.ohate.wynncraft4j.model.choices;

import java.time.Instant;

public class GuildChoice {

    private String name;
    private String prefix;
    private int level;
    private int members;
    private Instant created;

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getLevel() {
        return level;
    }

    public int getMembers() {
        return members;
    }

    public Instant getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "GuildChoice{" +
                "name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", level=" + level +
                ", members=" + members +
                ", created=" + created +
                '}';
    }

}
