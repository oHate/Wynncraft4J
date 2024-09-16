package dev.ohate.wynncraft4j.selection.guild;

import dev.ohate.wynncraft4j.http.WynncraftHttpResponse;
import dev.ohate.wynncraft4j.model.guild.Guild;
import dev.ohate.wynncraft4j.selection.choice.impl.GuildChoices;
import dev.ohate.wynncraft4j.selection.choice.model.GuildChoice;
import dev.ohate.wynncraft4j.util.StatusCode;
import dev.ohate.wynncraft4j.util.Utilities;

import java.util.Map;
import java.util.UUID;

public class GuildSelection extends GuildChoices {

    private final Guild guild;

    /**
     * Constructs a {@code GuildSelection} with a specified guild and map of guild choices.
     *
     * @param guild   The guild that was selected, or {@code null} if multiple choices exist.
     * @param choices A map of {@link GuildChoice} objects representing the possible guild choices.
     */
    public GuildSelection(Guild guild, Map<UUID, GuildChoice> choices) {
        super(choices);
        this.guild = guild;
    }

    /**
     * Returns the selected guild.
     *
     * @return The selected {@link Guild}, or {@code null} if multiple guild choices are available.
     */
    public Guild getGuild() {
        return guild;
    }

    /**
     * Creates a {@code GuildSelection} from a given HTTP response.
     * If the response status code indicates multiple choices, a selection of guilds is returned;
     * otherwise, a single {@link Guild} is returned.
     *
     * @param response The HTTP response containing the guild selection data.
     * @return A {@code GuildSelection} based on the response.
     */
    public static GuildSelection fromResponse(WynncraftHttpResponse response) {
        if (StatusCode.MULTIPLE_CHOICES.is(response.getStatusCode())) {
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

    /**
     * Returns a string representation of the {@code GuildSelection} object,
     * displaying the selected guild or indicating that there are multiple choices.
     *
     * @return A string representation of the {@code GuildSelection} object.
     */
    @Override
    public String toString() {
        return "GuildSelection{" +
                "guild=" + this.guild +
                '}';
    }

}
