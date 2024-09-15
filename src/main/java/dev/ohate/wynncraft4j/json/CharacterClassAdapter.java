package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import dev.ohate.wynncraft4j.model.character.CharacterClass;

import java.lang.reflect.Type;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassAdapter implements JsonDeserializer<CharacterClass> {

    private static final Pattern PATTERN = Pattern.compile("(.+)\\s\\((.+)\\)");

    @Override
    public CharacterClass deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();

        Matcher matcher = PATTERN.matcher(obj.get("name").getAsString());

        obj.addProperty("type", toEnum(matcher.group(1)));
        obj.addProperty("donorType", toEnum(matcher.group(2)));

        return context.deserialize(obj, CharacterClass.class);
    }

    private String toEnum(String string) {
        return string.replaceAll("\\s+", "_");
    }

}
