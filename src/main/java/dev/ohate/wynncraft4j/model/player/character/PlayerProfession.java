package dev.ohate.wynncraft4j.model.player.character;

public class PlayerProfession {

    private int level;
    private int xpPercent;

    public int getLevel() {
        return level;
    }

    public int getXpPercent() {
        return xpPercent;
    }

    @Override
    public String toString() {
        return "PlayerProfession{" +
                "level=" + level +
                ", xpPercent=" + xpPercent +
                '}';
    }

}
