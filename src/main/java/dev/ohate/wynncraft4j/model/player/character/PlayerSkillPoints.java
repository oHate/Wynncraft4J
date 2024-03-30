package dev.ohate.wynncraft4j.model.player.character;

public class PlayerSkillPoints {

    private int strength;
    private int dexterity;
    private int intelligence;
    private int defence;
    private int agility;

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDefence() {
        return defence;
    }

    public int getAgility() {
        return agility;
    }

    @Override
    public String toString() {
        return "PlayerSkillPoints{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                ", defence=" + defence +
                ", agility=" + agility +
                '}';
    }

}
