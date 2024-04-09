package dev.ohate.wynncraft4j.model.choices;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class GuildChoices implements Choice {

    public static final Type GUILD_MAP_TYPE = new TypeToken<Map<UUID, GuildChoice>>() {}.getType();

    private final Map<UUID, GuildChoice> choices;

    public GuildChoices(Map<UUID, GuildChoice> choices) {
        this.choices = choices;
    }

    public Map<UUID, GuildChoice> getChoices() {
        return choices;
    }

    @Override
    public boolean hasChoice() {
        return choices != null && !choices.isEmpty();
    }

    @Override
    public String toString() {
        return "GuildChoices{" +
                "choices=" + choices +
                '}';
    }

}
