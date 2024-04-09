package dev.ohate.wynncraft4j.api;

import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.choices.guild.GuildSelection;
import dev.ohate.wynncraft4j.model.guild.Guild;
import dev.ohate.wynncraft4j.model.guild.SimpleGuild;
import dev.ohate.wynncraft4j.model.guild.territory.GuildTerritory;

import java.util.Map;
import java.util.UUID;

public class GuildAPI extends API {

    public GuildAPI(WynncraftHttpClient client) {
        super(client);
    }

    public Guild getGuild(UUID uuid) {
        return get(Guild.class, "guild/uuid/" + uuid,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public Guild getGuildByPrefix(String prefix) {
        return get(Guild.class, "guild/prefix/" + prefix,
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public GuildSelection getGuildByName(String name) {
        return GuildSelection.fromResponse(
                getResponse("guild/" + name, HTTPQueryParams.create().add("identifier", "uuid"))
        );
    }

    public Map<UUID, SimpleGuild> getGuildList() {
        return get(SimpleGuild.GUILD_MAP_TYPE, "guild/list/guild",
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

    public Map<String, GuildTerritory> getGuildTerritoryList() {
        return get(GuildTerritory.TERRITORY_MAP_TYPE, "guild/list/territory",
                HTTPQueryParams.create().add("identifier", "uuid"));
    }

}
