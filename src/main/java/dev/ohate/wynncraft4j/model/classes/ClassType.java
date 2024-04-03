package dev.ohate.wynncraft4j.model.classes;

public enum ClassType {
    ARCHER("archer", "Archer (Hunter)", 1),
    WARRIOR("warrior", "Warrior (Knight)", 2),
    ASSASSIN("assassin", "Assassin (Ninja)", 2),
    MAGE("mage", "Mage (Dark Wizard)", 1),
    SHAMAN("shaman", "Shaman (Skyseer)", 3)
    ;

    private final String id;
    private final String name;
    private final int difficulty;

    private ClassType(String id, String name, int difficulty) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return id;
    }

}
