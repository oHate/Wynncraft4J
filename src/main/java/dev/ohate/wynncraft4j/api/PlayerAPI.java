package dev.ohate.wynncraft4j.api;

import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.character.CharacterEntry;
import dev.ohate.wynncraft4j.model.choices.player.PlayerAbilitiesSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerCharacterListSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerCharacterSelection;
import dev.ohate.wynncraft4j.model.choices.player.PlayerSelection;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.model.player.abilities.PlayerAbilities;
import dev.ohate.wynncraft4j.model.player.character.PlayerCharacter;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PlayerAPI extends API {

    public PlayerAPI(WynncraftHttpClient client) {
        super(client);
    }

    public Player getPlayer(UUID playerId) {
        return getPlayer(playerId, true);
    }

    public Player getPlayer(UUID playerId, boolean fullResult) {
        return getPlayer(playerId.toString(), fullResult).getPlayer();
    }

    public PlayerSelection getPlayer(String username) {
        return getPlayer(username, true);
    }

    public PlayerSelection getPlayer(String username, boolean fullResult) {
        return PlayerSelection.fromResponse(getResponse("player/" + username,
                fullResult ? HTTPQueryParams.create().add("fullResult", "True") : null));
    }

    public Map<UUID, CharacterEntry> getPlayerCharacters(UUID playerId) {
        return getPlayerCharacters(playerId.toString()).getCharacters();
    }

    public PlayerCharacterListSelection getPlayerCharacters(String username) {
        return PlayerCharacterListSelection.fromResponse(
                getResponse("player/" + username + "/characters", null)
        );
    }

    public PlayerCharacter getPlayerCharacter(UUID playerId, UUID characterId) {
        return getPlayerCharacter(playerId.toString(), characterId).getCharacter();
    }

    public PlayerCharacterSelection getPlayerCharacter(String username, UUID characterId) {
        return PlayerCharacterSelection.fromResponse(
                getResponse("player/" + username + "/characters/" + characterId.toString(), null)
        );
    }

    public PlayerAbilities getPlayerAbilities(UUID playerId, UUID characterId) {
        return getPlayerAbilities(playerId.toString(), characterId).getAbilities();
    }

    public PlayerAbilitiesSelection getPlayerAbilities(String username, UUID characterId) {
        return PlayerAbilitiesSelection.fromResponse(
                getResponse("player/" + username + "/characters/" + characterId, null)
        );
    }

}
