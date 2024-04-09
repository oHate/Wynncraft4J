package dev.ohate.wynncraft4j.model.character;

public enum CharacterType {
    UNKNOWN("Unknown"),
    ARCHER("Archer"),
    HUNTER("Hunter"),
    WARRIOR("Warrior"),
    KNIGHT("Knight"),
    ASSASSIN("Assassin"),
    NINJA("Ninja"),
    MAGE("Mage"),
    DARKWIZARD("Dark Wizard"),
    SHAMAN("Shaman"),
    SKYSEER("Skyseer")
    ;

    private final String name;

    private CharacterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CharacterType fromString(String name) {
        for (CharacterType value : values()) {
            if (value.name().equalsIgnoreCase(name)) {
                return value;
            }
        }

        return UNKNOWN;
    }

}
