package dev.ohate.wynncraft4j.api;

import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.character.CharacterEntry;
import dev.ohate.wynncraft4j.model.player.Player;
import dev.ohate.wynncraft4j.model.player.abilities.PlayerAbilities;
import dev.ohate.wynncraft4j.model.player.character.PlayerCharacter;
import dev.ohate.wynncraft4j.selection.player.PlayerAbilitiesSelection;
import dev.ohate.wynncraft4j.selection.player.PlayerCharacterListSelection;
import dev.ohate.wynncraft4j.selection.player.PlayerCharacterSelection;
import dev.ohate.wynncraft4j.selection.player.PlayerSelection;

import java.util.Map;
import java.util.UUID;

public class PlayerAPI extends API {

    /**
     * Constructs a new PlayerAPI instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public PlayerAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Retrieves player information by the player's UUID.
     *
     * @param playerId The UUID of the player.
     * @return The player profile.
     */
    public Player getPlayer(UUID playerId) {
        return getPlayer(playerId, true);
    }

    /**
     * Retrieves player information by the player's UUID, with the option to get full results.
     *
     * @param playerId   The UUID of the player.
     * @param fullResult If true, retrieves the full result.
     * @return The player profile.
     */
    public Player getPlayer(UUID playerId, boolean fullResult) {
        return getPlayer(playerId.toString(), fullResult).getPlayer();
    }

    /**
     * Retrieves player information by the player's username.
     * This method can return multiple results if more than one player has had that username.
     *
     * @param username The username of the player.
     * @return A selection of players matching the given username.
     */
    public PlayerSelection getPlayer(String username) {
        return getPlayer(username, true);
    }

    /**
     * Retrieves player information by the player's username, with the option to get full results.
     *
     * @param username   The username of the player.
     * @param fullResult If true, retrieves the full result.
     * @return The player selection result.
     */
    public PlayerSelection getPlayer(String username, boolean fullResult) {
        return PlayerSelection.fromResponse(getResponse("player/" + username,
                fullResult ? HTTPQueryParams.create().add("fullResult") : null));
    }

    /**
     * Retrieves a map of character entries for a player by their UUID.
     *
     * @param playerId The UUID of the player.
     * @return A map of character entries.
     */
    public Map<UUID, CharacterEntry> getPlayerCharacters(UUID playerId) {
        return getPlayerCharacters(playerId.toString()).getCharacters();
    }

    /**
     * Retrieves a list of player characters by their username.
     *
     * @param username The username of the player.
     * @return A selection of player characters.
     */
    public PlayerCharacterListSelection getPlayerCharacters(String username) {
        return PlayerCharacterListSelection.fromResponse(
                getResponse("player/" + username + "/characters", null)
        );
    }

    /**
     * Retrieves details of a specific character for a player by their UUIDs.
     *
     * @param playerId    The UUID of the player.
     * @param characterId The UUID of the character.
     * @return The player character details.
     */
    public PlayerCharacter getPlayerCharacter(UUID playerId, UUID characterId) {
        return getPlayerCharacter(playerId.toString(), characterId).getCharacter();
    }

    /**
     * Retrieves details of a specific character for a player by their username and character UUID.
     *
     * @param username    The username of the player.
     * @param characterId The UUID of the character.
     * @return The player character selection result.
     */
    public PlayerCharacterSelection getPlayerCharacter(String username, UUID characterId) {
        return PlayerCharacterSelection.fromResponse(
                getResponse("player/" + username + "/characters/" + characterId.toString(), null)
        );
    }

    /**
     * Retrieves abilities of a specific character for a player by their UUIDs.
     *
     * @param playerId    The UUID of the player.
     * @param characterId The UUID of the character.
     * @return The player abilities.
     */
    public PlayerAbilities getPlayerAbilities(UUID playerId, UUID characterId) {
        return getPlayerAbilities(playerId.toString(), characterId).getAbilities();
    }

    /**
     * Retrieves abilities of a specific character for a player by their username and character UUID.
     *
     * @param username    The username of the player.
     * @param characterId The UUID of the character.
     * @return The player abilities selection result.
     */
    public PlayerAbilitiesSelection getPlayerAbilities(String username, UUID characterId) {
        return PlayerAbilitiesSelection.fromResponse(
                getResponse("player/" + username + "/characters/" + characterId, null)
        );
    }

}
