package dev.ohate.wynncraft4j.model.guild.territory;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.model.guild.GuildEntry;

import java.lang.reflect.Type;
import java.time.Instant;
import java.util.Map;

public class GuildTerritory {

    public static final Type TERRITORY_MAP_TYPE = new TypeToken<Map<String, GuildTerritory>>() {
    }.getType();

    private GuildEntry guild;
    private Instant acquired;
    private GuildTerritoryLocation location;

    public GuildEntry getGuild() {
        return guild;
    }

    public Instant getAcquired() {
        return acquired;
    }

    public GuildTerritoryLocation getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "GuildTerritory{" +
                "guild=" + guild +
                ", acquired=" + acquired +
                ", location=" + location +
                '}';
    }

}
