package dev.ohate.wynncraft4j.model.player.character;

public class PlayerProfession {

    private int level;
    private int xpPercent;

    /**
     * Gets the level of the profession.
     *
     * @return the level of the profession.
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Gets the percentage of experience towards the next level of the profession.
     *
     * @return the percentage of experience towards the next level.
     */
    public int getXpPercent() {
        return this.xpPercent;
    }

    /**
     * Returns a string representation of the player profession.
     * The string includes the level and experience percentage.
     *
     * @return a string representation of the player profession.
     */
    @Override
    public String toString() {
        return "PlayerProfession{" +
                "level=" + this.level +
                ", xpPercent=" + this.xpPercent +
                '}';
    }

}
