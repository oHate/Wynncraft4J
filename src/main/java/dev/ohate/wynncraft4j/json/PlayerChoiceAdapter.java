package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.model.choices.PlayerChoice;
import dev.ohate.wynncraft4j.model.choices.PlayerChoicePair;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class PlayerChoiceAdapter implements JsonDeserializer<PlayerChoicePair> {

    private static final Type TYPE = new TypeToken<Map<UUID, PlayerChoice>>() {}.getType();

    @Override
    public PlayerChoicePair deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();

        if (obj.has("uuid")) {
            return new PlayerChoicePair(
                    Utilities.GSON.fromJson(json, Player.class),
                    null
            );
        } else {
            return new PlayerChoicePair(
                    null,
                    Utilities.GSON.fromJson(json, TYPE)
            );
        }
    }

}
