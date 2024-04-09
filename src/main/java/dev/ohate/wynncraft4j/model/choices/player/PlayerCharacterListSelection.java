package dev.ohate.wynncraft4j.model.choices.player;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.character.CharacterEntry;
import dev.ohate.wynncraft4j.model.choices.PlayerChoice;
import dev.ohate.wynncraft4j.model.choices.PlayerChoices;
import dev.ohate.wynncraft4j.util.Utilities;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class PlayerCharacterListSelection extends PlayerChoices {

    public static final Type CHARACTER_ENTRY_TYPE = new TypeToken<Map<UUID, CharacterEntry>>() {}.getType();

    private final Map<UUID, CharacterEntry> characters;

    public PlayerCharacterListSelection(Map<UUID, CharacterEntry> characters, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.characters = characters;
    }

    public Map<UUID, CharacterEntry> getCharacters() {
        return characters;
    }

    public static PlayerCharacterListSelection fromResponse(WynncraftHttpResponse response) {
        if (response.getStatusCode() == 300) {
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

    @Override
    public String toString() {
        return "PlayerCharacterListSelection{" +
                "characters=" + characters +
                "} " + super.toString();
    }
}
