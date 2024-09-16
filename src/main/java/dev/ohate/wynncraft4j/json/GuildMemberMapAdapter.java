package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import dev.ohate.wynncraft4j.model.guild.GuildMember;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GuildMemberMapAdapter implements JsonDeserializer<Map<UUID, GuildMember>> {

    @Override
    public Map<UUID, GuildMember> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        Map<UUID, GuildMember> memberMap = new HashMap<>();

        for (String key : jsonObj.keySet()) {
            JsonObject guildMemberObj = jsonObj.get(key).getAsJsonObject();
            guildMemberObj.addProperty("uuid", key);

            GuildMember guildMember = context.deserialize(guildMemberObj, GuildMember.class);
            memberMap.put(UUID.fromString(key), guildMember);
        }

        return memberMap;
    }

}
