package dev.ohate.wynncraft4j.model.search;

import com.google.gson.JsonObject;
import dev.ohate.wynncraft4j.model.guild.GuildEntry;
import dev.ohate.wynncraft4j.model.search.results.CoordinateSearchResult;
import dev.ohate.wynncraft4j.model.search.results.PlayerSearchResult;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class SearchResult {

    private String query;
    private Map<UUID, PlayerSearchResult> players;
    private Map<UUID, GuildEntry> guilds;
    private Map<UUID, GuildEntry> guildsPrefix;
    private Map<String, CoordinateSearchResult> territories;
    private Map<String, CoordinateSearchResult> discoveries;
    private Map<String, JsonObject> items;

    /**
     * Gets the original query string.
     *
     * @return the query string
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Gets a map of players found in the search result.
     * If no players are found, an empty map is returned.
     *
     * @return a map of players, or an empty map if no players are found
     */
    public Map<UUID, PlayerSearchResult> getPlayers() {
        return this.players == null ? Collections.emptyMap() : this.players;
    }

    /**
     * Gets a map of guilds found in the search result.
     * If no guilds are found, an empty map is returned.
     *
     * @return a map of guilds, or an empty map if no guilds are found
     */
    public Map<UUID, GuildEntry> getGuilds() {
        return this.guilds == null ? Collections.emptyMap() : this.guilds;
    }

    /**
     * Gets a map of guilds based on their prefix found in the search result.
     * If no guilds are found, an empty map is returned.
     *
     * @return a map of guilds based on their prefix, or an empty map if no guilds are found
     */
    public Map<UUID, GuildEntry> getGuildsPrefix() {
        return this.guildsPrefix == null ? Collections.emptyMap() : this.guildsPrefix;
    }

    /**
     * Gets a map of territories found in the search result.
     * If no territories are found, an empty map is returned.
     *
     * @return a map of territories, or an empty map if no territories are found
     */
    public Map<String, CoordinateSearchResult> getTerritories() {
        return this.territories == null ? Collections.emptyMap() : this.territories;
    }

    /**
     * Gets a map of discoveries found in the search result.
     * If no discoveries are found, an empty map is returned.
     *
     * @return a map of discoveries, or an empty map if no discoveries are found
     */
    public Map<String, CoordinateSearchResult> getDiscoveries() {
        return this.discoveries == null ? Collections.emptyMap() : this.discoveries;
    }

    /**
     * Gets a map of items found in the search result, represented as JsonObject.
     * If no items are found, an empty map is returned.
     *
     * @return a map of items, or an empty map if no items are found
     */
    public Map<String, JsonObject> getItems() {
        return this.items == null ? Collections.emptyMap() : this.items;
    }

    /**
     * Returns a string representation of the SearchResult.
     * The string includes the query, players, guilds, guild prefixes, territories, discoveries, and items.
     *
     * @return a string representation of the SearchResult
     */
    @Override
    public String toString() {
        return "SearchResult{" +
                "query='" + this.query + '\'' +
                ", players=" + this.players +
                ", guilds=" + this.guilds +
                ", guildsPrefix=" + this.guildsPrefix +
                ", territories=" + this.territories +
                ", discoveries=" + this.discoveries +
                ", items=" + this.items +
                '}';
    }

}
