package dev.ohate.wynncraft4j.model.player.character;

import dev.ohate.wynncraft4j.model.character.CharacterType;
import dev.ohate.wynncraft4j.model.player.global.PlayerDungeons;
import dev.ohate.wynncraft4j.model.player.global.PlayerPvP;
import dev.ohate.wynncraft4j.model.player.global.PlayerRaids;

import java.util.Arrays;

public class PlayerCharacter {

    private CharacterType type;
    private String nickname;
    private int level;
    private long xp;
    private int xpPercent;
    private int totalLevel;
    private int wars;
    private double playtime;
    private int mobsKilled;
    private int chestsFound;
    private int blocksWalked;
    private int itemsIdentified;
    private int logins;
    private int deaths;
    private int discoveries;
    private PlayerPvP pvp;
    private String[] gamemode;
    private PlayerSkillPoints skillPoints;
    private PlayerProfessions professions;
    private PlayerDungeons dungeons;
    private PlayerRaids raids;
    private String[] quests;

    /**
     * Returns the type of the player's character.
     *
     * @return The {@link CharacterType} of the player's character.
     */
    public CharacterType getType() {
        return this.type;
    }

    /**
     * Returns the nickname of the player's character.
     *
     * @return The nickname of the player's character.
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * Returns the level of the player's character.
     *
     * @return The level of the player's character.
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Returns the experience points (XP) of the player's character.
     *
     * @return The XP of the player's character.
     */
    public long getXp() {
        return this.xp;
    }

    /**
     * Returns the percentage of XP towards the next level.
     *
     * @return The XP percentage of the player's character.
     */
    public int getXpPercent() {
        return this.xpPercent;
    }

    /**
     * Returns the total level of the player's character across all professions.
     *
     * @return The total level of the player's character.
     */
    public int getTotalLevel() {
        return this.totalLevel;
    }

    /**
     * Returns the number of wars the player's character has participated in.
     *
     * @return The number of wars.
     */
    public int getWars() {
        return this.wars;
    }

    /**
     * Returns the total playtime of the player's character in hours.
     *
     * @return The playtime of the player's character.
     */
    public double getPlaytime() {
        return this.playtime;
    }

    /**
     * Returns the number of mobs killed by the player's character.
     *
     * @return The number of mobs killed.
     */
    public int getMobsKilled() {
        return this.mobsKilled;
    }

    /**
     * Returns the number of chests found by the player's character.
     *
     * @return The number of chests found.
     */
    public int getChestsFound() {
        return this.chestsFound;
    }

    /**
     * Returns the number of blocks walked by the player's character.
     *
     * @return The number of blocks walked.
     */
    public int getBlocksWalked() {
        return this.blocksWalked;
    }

    /**
     * Returns the number of items identified by the player's character.
     *
     * @return The number of items identified.
     */
    public int getItemsIdentified() {
        return this.itemsIdentified;
    }

    /**
     * Returns the number of logins of the player's character.
     *
     * @return The number of logins.
     */
    public int getLogins() {
        return this.logins;
    }

    /**
     * Returns the number of deaths of the player's character.
     *
     * @return The number of deaths.
     */
    public int getDeaths() {
        return this.deaths;
    }

    /**
     * Returns the number of discoveries made by the player's character.
     *
     * @return The number of discoveries.
     */
    public int getDiscoveries() {
        return this.discoveries;
    }

    /**
     * Returns the player's PvP statistics and achievements.
     *
     * @return The {@link PlayerPvP} object representing the player's PvP statistics.
     */
    public PlayerPvP getPvp() {
        return this.pvp;
    }

    /**
     * Returns the gamemodes the player's character has participated in.
     *
     * @return An array of gamemodes.
     */
    public String[] getGamemode() {
        return this.gamemode;
    }

    /**
     * Returns the skill points of the player's character.
     *
     * @return The {@link PlayerSkillPoints} object representing the skill points.
     */
    public PlayerSkillPoints getSkillPoints() {
        return this.skillPoints == null ? new PlayerSkillPoints() : skillPoints;
    }

    /**
     * Returns the professions the player's character has.
     *
     * @return The {@link PlayerProfessions} object representing the professions.
     */
    public PlayerProfessions getProfessions() {
        return this.professions;
    }

    /**
     * Returns the dungeons the player's character has completed.
     *
     * @return The {@link PlayerDungeons} object representing the completed dungeons.
     */
    public PlayerDungeons getDungeons() {
        return this.dungeons;
    }

    /**
     * Returns the raids the player's character has participated in.
     *
     * @return The {@link PlayerRaids} object representing the raids.
     */
    public PlayerRaids getRaids() {
        return this.raids;
    }

    /**
     * Returns the quests completed by the player's character.
     *
     * @return An array of completed quests.
     */
    public String[] getQuests() {
        return this.quests;
    }

    /**
     * Returns a string representation of the {@code PlayerCharacter} object,
     * including various attributes and statistics of the player's character.
     *
     * @return A string representation of the {@code PlayerCharacter} object.
     */
    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "type='" + this.type + '\'' +
                ", nickname='" + this.nickname + '\'' +
                ", level=" + this.level +
                ", xp=" + this.xp +
                ", xpPercent=" + this.xpPercent +
                ", totalLevel=" + this.totalLevel +
                ", wars=" + this.wars +
                ", playtime=" + this.playtime +
                ", mobsKilled=" + this.mobsKilled +
                ", chestsFound=" + this.chestsFound +
                ", blocksWalked=" + this.blocksWalked +
                ", itemsIdentified=" + this.itemsIdentified +
                ", logins=" + this.logins +
                ", deaths=" + this.deaths +
                ", discoveries=" + this.discoveries +
                ", pvp=" + this.pvp +
                ", gamemode=" + Arrays.toString(this.gamemode) +
                ", skillPoints=" + this.skillPoints +
                ", professions=" + this.professions +
                ", dungeons=" + this.dungeons +
                ", raids=" + this.raids +
                ", quests=" + Arrays.toString(this.quests) +
                '}';
    }

}
