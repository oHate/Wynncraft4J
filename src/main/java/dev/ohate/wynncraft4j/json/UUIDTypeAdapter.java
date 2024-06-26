package dev.ohate.wynncraft4j.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.UUID;

public class UUIDTypeAdapter implements JsonDeserializer<UUID> {

    @Override
    public UUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return UUID.fromString(json.getAsString());
    }

}
