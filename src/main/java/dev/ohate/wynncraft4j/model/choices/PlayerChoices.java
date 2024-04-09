package dev.ohate.wynncraft4j.model.choices;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class PlayerChoices implements Choice {

    public static final Type PLAYER_MAP_TYPE = new TypeToken<Map<UUID, PlayerChoice>>() {}.getType();

    private final Map<UUID, PlayerChoice> choices;

    public PlayerChoices(Map<UUID, PlayerChoice> choices) {
        this.choices = choices;
    }

    public Map<UUID, PlayerChoice> getChoices() {
        return choices;
    }

    @Override
    public boolean hasChoice() {
        return choices != null && !choices.isEmpty();
    }

    @Override
    public String toString() {
        return "PlayerChoices{" +
                "choices=" + choices +
                '}';
    }

}
