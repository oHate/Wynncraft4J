package dev.ohate.wynncraft4j.model.character;

import java.util.Arrays;
import java.util.Map;

public class CharacterEntry {

    private String type;
    private String nickname;
    private int level;
    private int xp;
    private int xpPercent;
    private int totalLevel;
    private String[] gamemode;
    private Map<String, Object> meta;

    public String[] getGamemode() {
        return gamemode;
    }

    public int getLevel() {
        return level;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTotalLevel() {
        return totalLevel;
    }

    public String getType() {
        return type;
    }

    public int getXp() {
        return xp;
    }

    public int getXpPercent() {
        return xpPercent;
    }

    @Override
    public String toString() {
        return "TestCharChoice{" +
                "gamemode=" + Arrays.toString(gamemode) +
                ", type='" + type + '\'' +
                ", nickname='" + nickname + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                ", xpPercent=" + xpPercent +
                ", totalLevel=" + totalLevel +
                ", meta=" + meta +
                '}';
    }

}
