package dev.ohate.wynncraft4j.model.choices.player;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.choices.PlayerChoice;
import dev.ohate.wynncraft4j.model.choices.PlayerChoices;
import dev.ohate.wynncraft4j.model.player.character.PlayerCharacter;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class PlayerCharacterSelection extends PlayerChoices {

    private final PlayerCharacter character;

    public PlayerCharacterSelection(PlayerCharacter character, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.character = character;
    }

    public PlayerCharacter getCharacter() {
        return character;
    }

    public static PlayerCharacterSelection fromResponse(WynncraftHttpResponse response) {
        if (response.getStatusCode() == 300) {
            return new PlayerCharacterSelection(
                    null,
                    Utilities.GSON.fromJson(response.getBody(), PlayerChoices.PLAYER_MAP_TYPE)
            );
        } else {
            return new PlayerCharacterSelection(
                    Utilities.GSON.fromJson(response.getBody(), PlayerCharacter.class),
                    null
            );
        }
    }

    @Override
    public String toString() {
        return "PlayerCharacterSelection{" +
                "character=" + character +
                "} " + super.toString();
    }

}
