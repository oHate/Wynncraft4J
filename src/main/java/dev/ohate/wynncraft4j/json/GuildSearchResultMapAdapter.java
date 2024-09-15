package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import dev.ohate.wynncraft4j.model.search.GuildSearchResult;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GuildSearchResultMapAdapter implements JsonDeserializer<Map<UUID, GuildSearchResult>> {

    @Override
    public Map<UUID, GuildSearchResult> deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        Map<UUID, GuildSearchResult> guildResultMap = new HashMap<>();

        for (String key : jsonObj.keySet()) {
            JsonObject guildResultObj = jsonObj.get(key).getAsJsonObject();
            guildResultObj.addProperty("uuid", key);

            GuildSearchResult guildSearchResult = context.deserialize(guildResultObj, GuildSearchResult.class);
            guildResultMap.put(UUID.fromString(key), guildSearchResult);
        }

        return guildResultMap;
    }

}
