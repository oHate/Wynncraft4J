package dev.ohate.wynncraft4j.selection.player;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.character.CharacterEntry;
import dev.ohate.wynncraft4j.selection.choice.impl.PlayerChoices;
import dev.ohate.wynncraft4j.selection.choice.model.PlayerChoice;
import dev.ohate.wynncraft4j.util.StatusCode;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class PlayerCharacterListSelection extends PlayerChoices {

    public static final Type CHARACTER_ENTRY_TYPE = new TypeToken<Map<UUID, CharacterEntry>>() {
    }.getType();

    private final Map<UUID, CharacterEntry> characters;

    /**
     * Constructs a {@code PlayerCharacterListSelection} with the specified map of characters and choices.
     *
     * @param characters The map of player characters, or {@code null} if multiple player choices exist.
     * @param choices    A map of {@link PlayerChoice} objects representing possible player choices.
     */
    public PlayerCharacterListSelection(Map<UUID, CharacterEntry> characters, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.characters = characters;
    }

    /**
     * Returns the map of player characters.
     *
     * @return The map of {@link CharacterEntry} objects, or {@code null} if multiple player choices are available.
     */
    public Map<UUID, CharacterEntry> getCharacters() {
        return characters;
    }

    /**
     * Creates a {@code PlayerCharacterListSelection} from a given HTTP response.
     * If the response status code indicates multiple choices, a selection of player options is returned;
     * otherwise, a map of player characters is returned.
     *
     * @param response The HTTP response containing the player character list selection data.
     * @return A {@code PlayerCharacterListSelection} based on the response.
     */
    public static PlayerCharacterListSelection fromResponse(WynncraftHttpResponse response) {
        if (StatusCode.MULTIPLE_CHOICES.is(response.getStatusCode())) {
            return new PlayerCharacterListSelection(
                    null,
                    Utilities.GSON.fromJson(response.getBody(), PlayerChoices.PLAYER_MAP_TYPE)
            );
        } else {
            return new PlayerCharacterListSelection(
                    Utilities.GSON.fromJson(response.getBody(), CHARACTER_ENTRY_TYPE),
                    null
            );
        }
    }

    /**
     * Returns a string representation of the {@code PlayerCharacterListSelection} object,
     * displaying the map of characters or indicating that there are multiple choices.
     *
     * @return A string representation of the {@code PlayerCharacterListSelection} object.
     */
    @Override
    public String toString() {
        return "PlayerCharacterListSelection{" +
                "characters=" + this.characters +
                "} " + super.toString();
    }

}
