package dev.ohate.wynncraft4j.model.classes;

import java.util.Map;

public class CharacterClass {

    private String id;
    private String name;
    private String lore;
    private int overallDifficulty;
    private Map<String, ClassArchetype> archetypes;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLore() {
        return lore;
    }

    public int getOverallDifficulty() {
        return overallDifficulty;
    }

    public Map<String, ClassArchetype> getArchetypes() {
        return archetypes;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lore='" + lore + '\'' +
                ", overallDifficulty=" + overallDifficulty +
                ", archetypes=" + archetypes +
                '}';
    }

}
