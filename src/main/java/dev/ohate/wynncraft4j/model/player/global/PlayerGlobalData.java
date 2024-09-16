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

    /**
     * Returns the number of wars the player has participated in.
     *
     * @return The number of wars.
     */
    public int getWars() {
        return this.wars;
    }

    /**
     * Returns the total level of the player's character.
     *
     * @return The total level.
     */
    public int getTotalLevel() {
        return this.totalLevel;
    }

    /**
     * Returns the total number of mobs the player has killed.
     *
     * @return The number of killed mobs.
     */
    public int getKilledMobs() {
        return this.killedMobs;
    }

    /**
     * Returns the total number of chests the player has found.
     *
     * @return The number of chests found.
     */
    public int getChestsFound() {
        return this.chestsFound;
    }

    /**
     * Returns the player's progress in dungeons.
     *
     * @return The player's dungeons progress.
     */
    public PlayerDungeons getDungeons() {
        return this.dungeons;
    }

    /**
     * Returns the player's progress in raids.
     *
     * @return The player's raids progress.
     */
    public PlayerRaids getRaids() {
        return this.raids;
    }

    /**
     * Returns the total number of quests the player has completed.
     *
     * @return The number of completed quests.
     */
    public int getCompletedQuests() {
        return this.completedQuests;
    }

    /**
     * Returns the player's progress in PvP activities.
     *
     * @return The player's PvP progress.
     */
    public PlayerPvP getPvp() {
        return this.pvp;
    }

    /**
     * Returns a string representation of the {@code PlayerGlobalData} object,
     * including various statistics and achievements.
     *
     * @return A string representation of the {@code PlayerGlobalData} object.
     */
    @Override
    public String toString() {
        return "PlayerGlobalData{" +
                "wars=" + this.wars +
                ", totalLevel=" + this.totalLevel +
                ", killedMobs=" + this.killedMobs +
                ", chestsFound=" + this.chestsFound +
                ", dungeons=" + this.dungeons +
                ", raids=" + this.raids +
                ", completedQuests=" + this.completedQuests +
                ", pvp=" + this.pvp +
                '}';
    }

}
