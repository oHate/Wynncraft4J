package dev.ohate.wynncraft4j.model.choices.player;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.choices.PlayerChoice;
import dev.ohate.wynncraft4j.model.choices.PlayerChoices;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class PlayerSelection extends PlayerChoices {

    private final Player player;

    public PlayerSelection(Player player, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public static PlayerSelection fromResponse(WynncraftHttpResponse response) {
        if (response.getStatusCode() == 300) {
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

    @Override
    public String toString() {
        return "PlayerSelection{" +
                "player=" + player +
                "} " + super.toString();
    }

}
