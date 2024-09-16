package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import dev.ohate.wynncraft4j.model.search.results.PlayerSearchResult;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerSearchResultMapAdapter implements JsonDeserializer<Map<UUID, PlayerSearchResult>> {

    @Override
    public Map<UUID, PlayerSearchResult> deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        Map<UUID, PlayerSearchResult> playerResultMap = new HashMap<>();

        for (String key : jsonObj.keySet()) {
            JsonObject playerResultObj = jsonObj.get(key).getAsJsonObject();
            playerResultObj.addProperty("uuid", key);

            PlayerSearchResult playerSearchResult = context.deserialize(playerResultObj, PlayerSearchResult.class);
            playerResultMap.put(UUID.fromString(key), playerSearchResult);
        }

        return playerResultMap;
    }

}
