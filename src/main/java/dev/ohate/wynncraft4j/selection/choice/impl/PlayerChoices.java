package dev.ohate.wynncraft4j.selection.choice.impl;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.selection.choice.Choice;
import dev.ohate.wynncraft4j.selection.choice.model.PlayerChoice;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class PlayerChoices extends Choice<UUID, PlayerChoice> {

    public static final Type PLAYER_MAP_TYPE = new TypeToken<Map<UUID, PlayerChoice>>() {
    }.getType();

    public PlayerChoices(Map<UUID, PlayerChoice> choices) {
        super(choices);
    }

}
