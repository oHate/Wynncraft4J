package dev.ohate.wynncraft4j.selection.player;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.player.abilities.PlayerAbilities;
import dev.ohate.wynncraft4j.selection.choice.impl.PlayerChoices;
import dev.ohate.wynncraft4j.selection.choice.model.PlayerChoice;
import dev.ohate.wynncraft4j.util.StatusCode;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class PlayerAbilitiesSelection extends PlayerChoices {

    private final PlayerAbilities abilities;

    /**
     * Constructs a {@code PlayerAbilitiesSelection} with the specified player abilities and choices.
     *
     * @param abilities The player's abilities, or {@code null} if multiple player choices exist.
     * @param choices   A map of {@link PlayerChoice} objects representing possible player choices.
     */
    public PlayerAbilitiesSelection(PlayerAbilities abilities, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.abilities = abilities;
    }

    /**
     * Returns the player's abilities.
     *
     * @return The {@link PlayerAbilities}, or {@code null} if multiple player choices are available.
     */
    public PlayerAbilities getAbilities() {
        return abilities;
    }

    /**
     * Creates a {@code PlayerAbilitiesSelection} from a given HTTP response.
     * If the response status code indicates multiple choices, a selection of player options is returned;
     * otherwise, a single {@link PlayerAbilities} instance is returned.
     *
     * @param response The HTTP response containing the player abilities selection data.
     * @return A {@code PlayerAbilitiesSelection} based on the response.
     */
    public static PlayerAbilitiesSelection fromResponse(WynncraftHttpResponse response) {
        if (StatusCode.MULTIPLE_CHOICES.is(response.getStatusCode())) {
            return new PlayerAbilitiesSelection(
                    null,
                    Utilities.GSON.fromJson(response.getBody(), PlayerChoices.PLAYER_MAP_TYPE)
            );
        } else {
            return new PlayerAbilitiesSelection(
                    Utilities.GSON.fromJson(response.getBody(), PlayerAbilities.class),
                    null
            );
        }
    }

    /**
     * Returns a string representation of the {@code PlayerAbilitiesSelection} object,
     * displaying the selected player abilities or indicating that there are multiple choices.
     *
     * @return A string representation of the {@code PlayerAbilitiesSelection} object.
     */
    @Override
    public String toString() {
        return "PlayerAbilitiesSelection{" +
                "abilities=" + this.abilities +
                '}';
    }

}
