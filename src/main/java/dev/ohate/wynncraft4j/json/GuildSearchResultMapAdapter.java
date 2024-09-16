package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import dev.ohate.wynncraft4j.model.guild.GuildEntry;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GuildSearchResultMapAdapter implements JsonDeserializer<Map<UUID, GuildEntry>> {

    @Override
    public Map<UUID, GuildEntry> deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        Map<UUID, GuildEntry> guildEntryMap = new HashMap<>();

        for (String key : jsonObj.keySet()) {
            JsonObject guildResultObj = jsonObj.get(key).getAsJsonObject();
            guildResultObj.addProperty("uuid", key);

            GuildEntry guildEntry = context.deserialize(guildResultObj, GuildEntry.class);
            guildEntryMap.put(UUID.fromString(key), guildEntry);
        }

        return guildEntryMap;
    }

}
