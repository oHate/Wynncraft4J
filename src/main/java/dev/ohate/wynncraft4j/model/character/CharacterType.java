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
    SKYSEER("Skyseer");

    /**
     * The name associated with the character type.
     */
    private final String name;

    /**
     * Constructs a CharacterType with the specified name.
     *
     * @param name the name of the character type
     */
    private CharacterType(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the character type.
     *
     * @return the name of the character type
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the non-donor type corresponding to this character type.
     * If the current type is {@code UNKNOWN}, an {@link IllegalStateException} is thrown.
     * <p>
     * The mapping from donor to non-donor types is as follows:
     * <ul>
     *     <li>{@code HUNTER} -> {@code ARCHER}</li>
     *     <li>{@code KNIGHT} -> {@code WARRIOR}</li>
     *     <li>{@code NINJA} -> {@code ASSASSIN}</li>
     *     <li>{@code DARK_WIZARD} -> {@code MAGE}</li>
     *     <li>{@code SKYSEER} -> {@code SHAMAN}</li>
     *     <li>All other types remain unchanged.</li>
     * </ul>
     *
     * @return the non-donor type corresponding to this character type
     * @throws IllegalStateException if the character type is {@code UNKNOWN}
     */
    public CharacterType getNonDonorType() {
        if (this == UNKNOWN) {
            throw new IllegalStateException("Cannot convert unknown character type to a non-donor type");
        }

        return switch (this) {
            case HUNTER -> ARCHER;
            case KNIGHT -> WARRIOR;
            case NINJA -> ASSASSIN;
            case DARKWIZARD -> MAGE;
            case SKYSEER -> SHAMAN;
            default -> this;
        };
    }

    /**
     * Returns the CharacterType corresponding to the given name.
     * If no matching type is found, returns {@code UNKNOWN}.
     *
     * @param name the name of the character type
     * @return the CharacterType corresponding to the name, or {@code UNKNOWN} if no match is found
     */
    public static CharacterType fromName(String name) {
        for (CharacterType value : values()) {
            if (value.name.equalsIgnoreCase(name)) {
                return value;
            }
        }

        return UNKNOWN;
    }

}
