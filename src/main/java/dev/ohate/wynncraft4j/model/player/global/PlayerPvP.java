package dev.ohate.wynncraft4j.model.player.global;

public class PlayerPvP {

    private int kills;
    private int deaths;

    /**
     * Returns the number of kills the player has achieved in PvP activities.
     *
     * @return The number of kills.
     */
    public int getKills() {
        return this.kills;
    }

    /**
     * Returns the number of times the player has died in PvP activities.
     *
     * @return The number of deaths.
     */
    public int getDeaths() {
        return this.deaths;
    }

    /**
     * Returns a string representation of the {@code PlayerPvP} object, including the number of kills and deaths.
     *
     * @return A string representation of the {@code PlayerPvP} object.
     */
    @Override
    public String toString() {
        return "PlayerPvP{" +
                "kills=" + this.kills +
                ", deaths=" + this.deaths +
                '}';
    }

}
