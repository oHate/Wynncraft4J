package dev.ohate.wynncraft4j.model.player.character;

public class PlayerSkillPoints {

    private int strength;
    private int dexterity;
    private int intelligence;
    private int defence;
    private int agility;

    /**
     * Returns the amount of skill points allocated to strength.
     *
     * @return The strength skill points.
     */
    public int getStrength() {
        return this.strength;
    }

    /**
     * Returns the amount of skill points allocated to dexterity.
     *
     * @return The dexterity skill points.
     */
    public int getDexterity() {
        return this.dexterity;
    }

    /**
     * Returns the amount of skill points allocated to intelligence.
     *
     * @return The intelligence skill points.
     */
    public int getIntelligence() {
        return this.intelligence;
    }

    /**
     * Returns the amount of skill points allocated to defence.
     *
     * @return The defence skill points.
     */
    public int getDefence() {
        return this.defence;
    }

    /**
     * Returns the amount of skill points allocated to agility.
     *
     * @return The agility skill points.
     */
    public int getAgility() {
        return this.agility;
    }

    /**
     * Returns a string representation of the {@code PlayerSkillPoints} object,
     * including the allocated skill points for each attribute.
     *
     * @return A string representation of the {@code PlayerSkillPoints} object.
     */
    @Override
    public String toString() {
        return "PlayerSkillPoints{" +
                "strength=" + this.strength +
                ", dexterity=" + this.dexterity +
                ", intelligence=" + this.intelligence +
                ", defence=" + this.defence +
                ", agility=" + this.agility +
                '}';
    }

}
