package dev.ohate.wynncraft4j.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.ohate.wynncraft4j.json.InstantTypeAdapter;
import dev.ohate.wynncraft4j.json.UUIDTypeAdapter;

import java.time.Instant;
import java.util.UUID;

public class Utilities {

    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(UUID.class, new UUIDTypeAdapter())
            .registerTypeAdapter(Instant.class, new InstantTypeAdapter())
            .create();

}
