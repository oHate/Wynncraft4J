package dev.ohate.wynncraft4j.selection.player;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.selection.choice.impl.PlayerChoices;
import dev.ohate.wynncraft4j.selection.choice.model.PlayerChoice;
import dev.ohate.wynncraft4j.util.StatusCode;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class PlayerSelection extends PlayerChoices {

    private final Player player;

    /**
     * Constructs a {@code PlayerSelection} with the specified player and choices.
     *
     * @param player  The player, or {@code null} if multiple player choices exist.
     * @param choices A map of {@link PlayerChoice} objects representing possible player choices.
     */
    public PlayerSelection(Player player, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.player = player;
    }

    /**
     * Returns the selected player.
     *
     * @return The {@link Player}, or {@code null} if multiple player choices are available.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Creates a {@code PlayerSelection} from a given HTTP response.
     * If the response status code indicates multiple choices, a selection of player options is returned;
     * otherwise, a single {@link Player} instance is returned.
     *
     * @param response The HTTP response containing the player selection data.
     * @return A {@code PlayerSelection} based on the response.
     */
    public static PlayerSelection fromResponse(WynncraftHttpResponse response) {
        if (StatusCode.MULTIPLE_CHOICES.is(response.getStatusCode())) {
            return new PlayerSelection(
                    null,
                    Utilities.GSON.fromJson(response.getBody(), PlayerChoices.PLAYER_MAP_TYPE)
            );
        } else {
            return new PlayerSelection(
                    Utilities.GSON.fromJson(response.getBody(), Player.class),
                    null
            );
        }
    }

    /**
     * Returns a string representation of the {@code PlayerSelection} object,
     * displaying the selected player or indicating that there are multiple choices.
     *
     * @return A string representation of the {@code PlayerSelection} object.
     */
    @Override
    public String toString() {
        return "PlayerSelection{" +
                "player=" + this.player +
                "} " + super.toString();
    }

}
