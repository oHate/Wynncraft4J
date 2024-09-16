package dev.ohate.wynncraft4j.api;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.map.MapLocation;

import java.lang.reflect.Type;

public class MapAPI extends API {

    private static final Type MAP_LOCATION_ARRAY_TYPE = new TypeToken<MapLocation[]>() {
    }.getType();

    /**
     * Constructs a new API instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public MapAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Retrieves an array of map locations.
     *
     * @return an array of {@link MapLocation} objects representing map markers.
     */
    public MapLocation[] getMapLocations() {
        return get(MAP_LOCATION_ARRAY_TYPE, "map/locations/markers");
    }

    /**
     * Retrieves the total number of quests.
     *
     * @return the total number of quests as an integer.
     */
    public int getTotalQuests() {
        return get(JsonObject.class, "map/locations/markers").get("quests").getAsInt();
    }

}
