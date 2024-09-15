package dev.ohate.wynncraft4j.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.json.*;
import dev.ohate.wynncraft4j.model.character.CharacterClass;
import dev.ohate.wynncraft4j.model.guild.GuildMember;
import dev.ohate.wynncraft4j.model.search.CoordinateSearchResult;
import dev.ohate.wynncraft4j.model.search.GuildSearchResult;
import dev.ohate.wynncraft4j.model.search.PlayerSearchResult;

import java.awt.*;
import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public class Utilities {

    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(new TypeToken<Map<String, CoordinateSearchResult>>() {}.getType(), new CoordinateSearchResultMapAdapter())
            .registerTypeAdapter(new TypeToken<Map<String, GuildSearchResult>>() {}.getType(), new GuildSearchResultMapAdapter())
            .registerTypeAdapter(new TypeToken<Map<String, PlayerSearchResult>>() {}.getType(), new PlayerSearchResultMapAdapter())
            .registerTypeAdapter(new TypeToken<Map<UUID, GuildMember>>() {}.getType(), new GuildMemberMapAdapter())
            .registerTypeAdapter(CharacterClass.class, new CharacterClassAdapter())
            .registerTypeAdapter(Color.class, new ColorTypeAdapter())
            .registerTypeAdapter(UUID.class, new UUIDTypeAdapter())
            .registerTypeAdapter(Instant.class, new InstantTypeAdapter())
            .create();

}
