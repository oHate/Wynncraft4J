package dev.ohate.wynncraft4j.model.leaderboard;

import com.google.gson.JsonObject;

public class GamemodeLeaderboardEntry extends PlayerLeaderboardEntry {

    private JsonObject characterData;

    /**
     * Returns the character data associated with this leaderboard entry.
     *
     * @return a {@link JsonObject} containing the player's character data.
     */
    public JsonObject getCharacterData() {
        return this.characterData;
    }

    /**
     * Returns a string representation of the gamemode leaderboard entry,
     * including the character data.
     *
     * @return a string representation of the {@code GamemodeLeaderboardEntry}.
     */
    @Override
    public String toString() {
        return "GamemodeLeaderboardEntry{" +
                "characterData=" + this.characterData +
                "} " + super.toString();
    }

}
