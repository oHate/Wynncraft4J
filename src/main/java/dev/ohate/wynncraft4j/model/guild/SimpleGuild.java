package dev.ohate.wynncraft4j.model.guild;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

public class SimpleGuild {

    public static final Type GUILD_MAP_TYPE = new TypeToken<Map<UUID, SimpleGuild>>() {}.getType();

    private UUID uuid;
    private String name;
    private String prefix;

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    @Override
    public String toString() {
        return "SimpleGuild{" +
                "uuid='" + uuid +'\'' +
                "name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                '}';
    }

}
