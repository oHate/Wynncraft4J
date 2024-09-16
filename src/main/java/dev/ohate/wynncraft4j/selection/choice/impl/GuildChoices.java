package dev.ohate.wynncraft4j.selection.choice.impl;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.selection.choice.Choice;
import dev.ohate.wynncraft4j.selection.choice.model.GuildChoice;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class GuildChoices extends Choice<UUID, GuildChoice> {

    public static final Type GUILD_MAP_TYPE = new TypeToken<Map<UUID, GuildChoice>>() {
    }.getType();

    public GuildChoices(Map<UUID, GuildChoice> choices) {
        super(choices);
    }

}
