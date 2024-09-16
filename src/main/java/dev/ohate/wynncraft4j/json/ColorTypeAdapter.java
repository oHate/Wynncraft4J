package dev.ohate.wynncraft4j.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.awt.*;
import java.lang.reflect.Type;

public class ColorTypeAdapter implements JsonDeserializer<Color> {

    @Override
    public Color deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        return Color.decode(json.getAsString());
    }

}
