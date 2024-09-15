package dev.ohate.wynncraft4j.model.character;

import java.util.Map;

public class CharacterClassInfo {

    private String id;
    private String name;
    private String lore;
    private int overallDifficulty;
    private Map<String, CharacterArchetype> archetypes;

    /**
     * Gets the unique identifier of the character class.
     *
     * @return the unique identifier of the character class
     */
    public String getId() {
        return this.id;
    }

    /**
     * Gets the name of the character class.
     *
     * @return the name of the character class
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the lore or description of the character class.
     *
     * @return the lore of the character class
     */
    public String getLore() {
        return this.lore;
    }

    /**
     * Gets the overall difficulty rating of the character class.
     *
     * @return the overall difficulty of the character class
     */
    public int getOverallDifficulty() {
        return this.overallDifficulty;
    }

    /**
     * Gets a map of archetypes associated with the character class.
     * The map's keys are archetype names, and the values are {@link CharacterArchetype} instances.
     *
     * @return a map of archetypes associated with the character class
     */
    public Map<String, CharacterArchetype> getArchetypes() {
        return this.archetypes;
    }

    /**
     * Returns a string representation of the character class.
     *
     * @return a string representation of the character class
     */
    @Override
    public String toString() {
        return "CharacterClassInfo{" +
                "id='" + this.id + '\'' +
                ", name='" + this.name + '\'' +
                ", lore='" + this.lore + '\'' +
                ", overallDifficulty=" + this.overallDifficulty +
                ", archetypes=" + this.archetypes +
                '}';
    }

}
