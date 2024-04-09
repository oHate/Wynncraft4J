package dev.ohate.wynncraft4j.model.character;

public class CharacterArchetype {

    private String name;
    private int difficulty;
    private int damage;
    private int defence;
    private int range;
    private int speed;

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefence() {
        return defence;
    }

    public int getRange() {
        return range;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CharacterArchetype{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", damage=" + damage +
                ", defence=" + defence +
                ", range=" + range +
                ", speed=" + speed +
                '}';
    }

}
