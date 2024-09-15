package dev.ohate.wynncraft4j.api;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.character.CharacterClass;
import dev.ohate.wynncraft4j.model.character.CharacterClassInfo;
import dev.ohate.wynncraft4j.model.character.CharacterType;

import java.lang.reflect.Type;
import java.util.Map;

public class ClassesAPI extends API {

    public static final Type CHARACTER_CLASS_MAP_TYPE = new TypeToken<Map<String, CharacterClass>>() {
    }.getType();

    /**
     * Constructs a new API instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public ClassesAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Retrieves a map of all available character classes.
     * The map contains character class names as keys and {@link CharacterClass} instances as values.
     *
     * @return a map where the keys are character class names and the values are {@link CharacterClass} instances
     */
    public Map<String, CharacterClass> getClassList() {
        return get(CHARACTER_CLASS_MAP_TYPE, "classes");
    }

    /**
     * Retrieves detailed information about a specific character class type.
     * The method fetches information for the non-donor type if the given type is a donor type.
     *
     * @param type the {@link CharacterType} for which class information is to be retrieved
     * @return the {@link CharacterClassInfo} for the specified character type
     */
    public CharacterClassInfo getClassInfo(CharacterType type) {
        return get(CharacterClassInfo.class, "classes/" + type.getNonDonorType().name().toLowerCase());
    }

}
