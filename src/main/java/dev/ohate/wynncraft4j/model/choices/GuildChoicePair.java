package dev.ohate.wynncraft4j.model.choices;

import dev.ohate.wynncraft4j.model.guild.Guild;

import java.util.Map;
import java.util.UUID;

public class GuildChoicePair {

    private final Guild player;
    private final Map<UUID, GuildChoice> choices;

    public GuildChoicePair(Guild player, Map<UUID, GuildChoice> choices) {
        this.player = player;
        this.choices = choices;
    }

    public boolean hasChoices() {
        return player == null;
    }

    public Guild getPlayer() {
        return player;
    }

    public Map<UUID, GuildChoice> getChoices() {
        return choices;
    }

    @Override
    public String toString() {
        return "GuildChoicePair{" +
                "player=" + player +
                ", choices=" + choices +
                '}';
    }

}
