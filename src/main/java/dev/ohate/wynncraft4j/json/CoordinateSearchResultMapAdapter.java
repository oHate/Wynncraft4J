package dev.ohate.wynncraft4j.json;

import com.google.gson.*;
import dev.ohate.wynncraft4j.model.search.CoordinateSearchResult;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CoordinateSearchResultMapAdapter implements JsonDeserializer<Map<String, CoordinateSearchResult>> {

    @Override
    public Map<String, CoordinateSearchResult> deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObj = json.getAsJsonObject();
        Map<String, CoordinateSearchResult> coordinateResultMap = new HashMap<>();

        for (String key : jsonObj.keySet()) {
            JsonObject coordinateResultObj = jsonObj.get(key).getAsJsonObject();
            coordinateResultObj.addProperty("name", key);

            CoordinateSearchResult coordinateSearchResult = context.deserialize(coordinateResultObj, CoordinateSearchResult.class);
            coordinateResultMap.put(key, coordinateSearchResult);
        }

        return coordinateResultMap;
    }

}
