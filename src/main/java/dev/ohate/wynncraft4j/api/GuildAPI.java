package dev.ohate.wynncraft4j.api;

import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.guild.Guild;
import dev.ohate.wynncraft4j.model.guild.GuildEntry;
import dev.ohate.wynncraft4j.model.guild.territory.GuildTerritory;
import dev.ohate.wynncraft4j.selection.guild.GuildSelection;

import java.util.Map;
import java.util.UUID;

public class GuildAPI extends API {

    /**
     * Constructs a new GuildAPI instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public GuildAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Retrieves guild information by the UUID of the guild.
     *
     * @param uuid The UUID of the guild.
     * @return The guild details.
     */
    public Guild getGuild(UUID uuid) {
        return get(Guild.class, "guild/uuid/" + uuid,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    /**
     * Retrieves guild information by the guild's prefix.
     *
     * @param prefix The prefix of the guild.
     * @return The guild details.
     */
    public Guild getGuildByPrefix(String prefix) {
        return get(Guild.class, "guild/prefix/" + prefix,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    /**
     * Retrieves guild information by the name of the guild.
     * This method can return multiple results if more than one guild matches the name.
     *
     * @param name The name of the guild.
     * @return A selection of guilds matching the given name.
     */
    public GuildSelection getGuildByName(String name) {
        return GuildSelection.fromResponse(
                getResponse("guild/" + name, HTTPQueryParams.create().add("identifier", "uuid"))
        );
    }

    /**
     * Retrieves a list of all guilds.
     *
     * @return A map of guild UUIDs to simple guild details.
     */
    public Map<UUID, GuildEntry> getGuildList() {
        return get(GuildEntry.GUILD_MAP_TYPE, "guild/list/guild",
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    /**
     * Retrieves a list of all guild territories.
     *
     * @return A map of territory names to guild territory details.
     */
    public Map<String, GuildTerritory> getGuildTerritoryList() {
        return get(GuildTerritory.TERRITORY_MAP_TYPE, "guild/list/territory",
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

}
