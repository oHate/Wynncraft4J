package dev.ohate.wynncraft4j.model.player.global;

public class PlayerGlobalData {

    private int wars;
    private int totalLevel;
    private int killedMobs;
    private int chestsFound;
    private PlayerDungeons dungeons;
    private PlayerRaids raids;
    private int completedQuests;
    private PlayerPvP pvp;

    public int getWars() {
        return wars;
    }

    public int getTotalLevel() {
        return totalLevel;
    }

    public int getKilledMobs() {
        return killedMobs;
    }

    public int getChestsFound() {
        return chestsFound;
    }

    public PlayerDungeons getDungeons() {
        return dungeons;
    }

    public PlayerRaids getRaids() {
        return raids;
    }

    public int getCompletedQuests() {
        return completedQuests;
    }

    public PlayerPvP getPvp() {
        return pvp;
    }

    @Override
    public String toString() {
        return "PlayerGlobalData{" +
                "wars=" + wars +
                ", totalLevel=" + totalLevel +
                ", killedMobs=" + killedMobs +
                ", chestsFound=" + chestsFound +
                ", dungeons=" + dungeons +
                ", raids=" + raids +
                ", completedQuests=" + completedQuests +
                ", pvp=" + pvp +
                '}';
    }

}
