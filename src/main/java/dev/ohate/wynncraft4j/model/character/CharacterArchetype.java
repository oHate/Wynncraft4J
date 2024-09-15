package dev.ohate.wynncraft4j.model.character;

import java.util.regex.Pattern;

public class CharacterArchetype {

    private static final Pattern STRIP_COLOR_PATTERN = Pattern.compile("(?i)&[0-9A-FK-OR]");

    private String name;
    private int difficulty;
    private int damage;
    private int defence;
    private int range;
    private int speed;

    /**
     * Gets the name of the character archetype.
     *
     * @return the name of the character archetype
     */
    public String getName() {
        return STRIP_COLOR_PATTERN.matcher(this.name).replaceAll("");
    }

    /**
     * Gets the difficulty level of the character archetype.
     *
     * @return the difficulty level of the character archetype
     */
    public int getDifficulty() {
        return this.difficulty;
    }

    /**
     * Gets the damage attribute of the character archetype.
     *
     * @return the damage attribute of the character archetype
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * Gets the defence attribute of the character archetype.
     *
     * @return the defence attribute of the character archetype
     */
    public int getDefence() {
        return this.defence;
    }

    /**
     * Gets the range attribute of the character archetype.
     *
     * @return the range attribute of the character archetype
     */
    public int getRange() {
        return this.range;
    }

    /**
     * Gets the speed attribute of the character archetype.
     *
     * @return the speed attribute of the character archetype
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Returns a string representation of the character archetype.
     *
     * @return a string representation of the character archetype
     */
    @Override
    public String toString() {
        return "CharacterArchetype{" +
                "name='" + getName() + '\'' +
                ", difficulty=" + this.difficulty +
                ", damage=" + this.damage +
                ", defence=" + this.defence +
                ", range=" + this.range +
                ", speed=" + this.speed +
                '}';
    }

}
