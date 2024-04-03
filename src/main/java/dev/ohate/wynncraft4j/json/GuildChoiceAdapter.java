package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.model.choices.GuildChoicePair;
import dev.ohate.wynncraft4j.model.guild.Guild;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class GuildChoiceAdapter implements JsonDeserializer<GuildChoicePair> {

    private static final Type TYPE = new TypeToken<Map<UUID, GuildChoicePair>>() {}.getType();

    @Override
    public GuildChoicePair deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();

        if (obj.has("uuid")) {
            return new GuildChoicePair(
                    Utilities.GSON.fromJson(json, Guild.class),
                    null
            );
        } else {
            return new GuildChoicePair(
                    null,
                    Utilities.GSON.fromJson(json, TYPE)
            );
        }
    }

}
