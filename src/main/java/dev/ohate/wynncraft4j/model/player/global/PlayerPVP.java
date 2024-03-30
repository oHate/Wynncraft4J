package dev.ohate.wynncraft4j.model.player.global;

public class PlayerPVP {

    private int kills;
    private int deaths;

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    @Override
    public String toString() {
        return "PlayerPVP{" +
                "kills=" + kills +
                ", deaths=" + deaths +
                '}';
    }

}
