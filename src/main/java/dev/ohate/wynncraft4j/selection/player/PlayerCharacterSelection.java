package dev.ohate.wynncraft4j.selection.player;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.player.character.PlayerCharacter;
import dev.ohate.wynncraft4j.selection.choice.impl.PlayerChoices;
import dev.ohate.wynncraft4j.selection.choice.model.PlayerChoice;
import dev.ohate.wynncraft4j.util.StatusCode;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class PlayerCharacterSelection extends PlayerChoices {

    private final PlayerCharacter character;

    /**
     * Constructs a {@code PlayerCharacterSelection} with the specified player character and choices.
     *
     * @param character The player character, or {@code null} if multiple player choices exist.
     * @param choices   A map of {@link PlayerChoice} objects representing possible player choices.
     */
    public PlayerCharacterSelection(PlayerCharacter character, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.character = character;
    }

    /**
     * Returns the selected player character.
     *
     * @return The {@link PlayerCharacter}, or {@code null} if multiple player choices are available.
     */
    public PlayerCharacter getCharacter() {
        return character;
    }

    /**
     * Creates a {@code PlayerCharacterSelection} from a given HTTP response.
     * If the response status code indicates multiple choices, a selection of player options is returned;
     * otherwise, a single {@link PlayerCharacter} instance is returned.
     *
     * @param response The HTTP response containing the player character selection data.
     * @return A {@code PlayerCharacterSelection} based on the response.
     */
    public static PlayerCharacterSelection fromResponse(WynncraftHttpResponse response) {
        if (StatusCode.MULTIPLE_CHOICES.is(response.getStatusCode())) {
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

    /**
     * Returns a string representation of the {@code PlayerCharacterSelection} object,
     * displaying the selected player character or indicating that there are multiple choices.
     *
     * @return A string representation of the {@code PlayerCharacterSelection} object.
     */
    @Override
    public String toString() {
        return "PlayerCharacterSelection{" +
                "character=" + this.character +
                "} " + super.toString();
    }

}
