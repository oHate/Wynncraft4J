package dev.ohate.wynncraft4j.model.choices.player;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.choices.PlayerChoice;
import dev.ohate.wynncraft4j.model.choices.PlayerChoices;
import dev.ohate.wynncraft4j.model.player.abilities.PlayerAbilities;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class PlayerAbilitiesSelection extends PlayerChoices {

    private final PlayerAbilities abilities;

    public PlayerAbilitiesSelection(PlayerAbilities abilities, Map<UUID, PlayerChoice> choices) {
        super(choices);
        this.abilities = abilities;
    }

    public PlayerAbilities getAbilities() {
        return abilities;
    }

    public static PlayerAbilitiesSelection fromResponse(WynncraftHttpResponse response) {
        if (response.getStatusCode() == 300) {
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

    @Override
    public String toString() {
        return "PlayerAbilitiesSelection{" +
                "abilities=" + abilities +
                '}';
    }

}
