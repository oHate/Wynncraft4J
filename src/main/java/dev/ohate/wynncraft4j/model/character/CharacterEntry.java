package dev.ohate.wynncraft4j.model.character;

import java.util.Arrays;
import java.util.Map;

public class CharacterEntry {

    private String type;
    private String nickname;
    private int level;
    private long xp;
    private int xpPercent;
    private int totalLevel;
    private String[] gamemode;
    private Map<String, Object> meta;

    /**
     * Gets the level of the character.
     *
     * @return the level of the character.
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Gets the metadata associated with the character.
     *
     * @return a map of metadata for the character.
     */
    public Map<String, Object> getMeta() {
        return this.meta;
    }

    /**
     * Gets the nickname of the character.
     *
     * @return the nickname of the character.
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * Gets the total level of the character, including all classes.
     *
     * @return the total level of the character.
     */
    public int getTotalLevel() {
        return this.totalLevel;
    }

    /**
     * Gets the type of the character.
     *
     * @return the type of the character.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the experience points of the character.
     *
     * @return the experience points of the character.
     */
    public long getXp() {
        return this.xp;
    }

    /**
     * Gets the percentage of experience towards the next level.
     *
     * @return the percentage of experience towards the next level.
     */
    public int getXpPercent() {
        return this.xpPercent;
    }

    /**
     * Returns a string representation of the character entry.
     * The string includes the gamemode(s), type, nickname, level,
     * experience, experience percentage, total level, and metadata.
     *
     * @return a string representation of the character entry.
     */
    @Override
    public String toString() {
        return "CharacterEntry{" +
                "gamemode=" + Arrays.toString(this.gamemode) +
                ", type='" + this.type + '\'' +
                ", nickname='" + this.nickname + '\'' +
                ", level=" + this.level +
                ", xp=" + this.xp +
                ", xpPercent=" + this.xpPercent +
                ", totalLevel=" + this.totalLevel +
                ", meta=" + this.meta +
                '}';
    }

}