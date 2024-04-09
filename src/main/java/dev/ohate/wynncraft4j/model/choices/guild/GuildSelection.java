package dev.ohate.wynncraft4j.model.choices.guild;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.choices.GuildChoice;
import dev.ohate.wynncraft4j.model.choices.GuildChoices;
import dev.ohate.wynncraft4j.model.guild.Guild;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class GuildSelection extends GuildChoices {

    private final Guild guild;

    public GuildSelection(Guild guild, Map<UUID, GuildChoice> choices) {
        super(choices);
        this.guild = guild;
    }

    public Guild getGuild() {
        return guild;
    }

    public static GuildSelection fromResponse(WynncraftHttpResponse response) {
        if (response.getStatusCode() == 300) {
            return new GuildSelection(
                    null,
                    Utilities.GSON.fromJson(response.getBody(), GuildChoices.GUILD_MAP_TYPE)
            );
        } else {
            return new GuildSelection(
                    Utilities.GSON.fromJson(response.getBody(), Guild.class),
                    null
            );
        }
    }

    @Override
    public String toString() {
        return "GuildSelection{" +
                "guild=" + guild +
                '}';
    }

}
