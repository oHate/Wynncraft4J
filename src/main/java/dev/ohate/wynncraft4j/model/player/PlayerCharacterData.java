package dev.ohate.wynncraft4j.model.player;

import dev.ohate.wynncraft4j.model.player.character.PlayerProfessions;
import dev.ohate.wynncraft4j.model.player.character.PlayerSkillPoints;
import dev.ohate.wynncraft4j.model.player.global.PlayerDungeons;
import dev.ohate.wynncraft4j.model.player.global.PlayerPVP;
import dev.ohate.wynncraft4j.model.player.global.PlayerRaids;

import java.util.Arrays;

public class PlayerCharacterData {

    private String type;
    private String nickname;
    private int level;
    private int xp;
    private int xpPercent;
    private int totalLevel;
    private int wars;
    private int playtime;
    private int mobsKilled;
    private int chestsFound;
    private int blocksWalked;
    private int itemsIdentified;
    private int logins;
    private int deaths;
    private int discoveries;
    private PlayerPVP pvp;
    private String[] gamemode;
    private PlayerSkillPoints skillPoints;
    private PlayerProfessions professions;
    private PlayerDungeons dungeons;
    private PlayerRaids raids;
    private String[] quests;

    public String getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getXpPercent() {
        return xpPercent;
    }

    public int getTotalLevel() {
        return totalLevel;
    }

    public int getWars() {
        return wars;
    }

    public int getPlaytime() {
        return playtime;
    }

    public int getMobsKilled() {
        return mobsKilled;
    }

    public int getChestsFound() {
        return chestsFound;
    }

    public int getBlocksWalked() {
        return blocksWalked;
    }

    public int getItemsIdentified() {
        return itemsIdentified;
    }

    public int getLogins() {
        return logins;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getDiscoveries() {
        return discoveries;
    }

    public PlayerPVP getPvp() {
        return pvp;
    }

    public String[] getGamemode() {
        return gamemode;
    }

    public PlayerSkillPoints getSkillPoints() {
        return skillPoints;
    }

    public PlayerProfessions getProfessions() {
        return professions;
    }

    public PlayerDungeons getDungeons() {
        return dungeons;
    }

    public PlayerRaids getRaids() {
        return raids;
    }

    public String[] getQuests() {
        return quests;
    }

    @Override
    public String toString() {
        return "PlayerCharacterData{" +
                "type='" + type + '\'' +
                ", nickname='" + nickname + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                ", xpPercent=" + xpPercent +
                ", totalLevel=" + totalLevel +
                ", wars=" + wars +
                ", playtime=" + playtime +
                ", mobsKilled=" + mobsKilled +
                ", chestsFound=" + chestsFound +
                ", blocksWalked=" + blocksWalked +
                ", itemsIdentified=" + itemsIdentified +
                ", logins=" + logins +
                ", deaths=" + deaths +
                ", discoveries=" + discoveries +
                ", pvp=" + pvp +
                ", gamemode=" + Arrays.toString(gamemode) +
                ", skillPoints=" + skillPoints +
                ", professions=" + professions +
                ", dungeons=" + dungeons +
                ", raids=" + raids +
                ", quests=" + Arrays.toString(quests) +
                '}';
    }

}
