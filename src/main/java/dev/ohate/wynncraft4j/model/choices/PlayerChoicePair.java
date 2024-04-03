package dev.ohate.wynncraft4j.model.choices;

import dev.ohate.wynncraft4j.model.player.Player;

import java.util.Map;
import java.util.UUID;

public class PlayerChoicePair {

    private final Player player;
    private final Map<UUID, PlayerChoice> choices;

    public PlayerChoicePair(Player player, Map<UUID, PlayerChoice> choices) {
        this.player = player;
        this.choices = choices;
    }

    public boolean hasChoices() {
        return player == null;
    }

    public Player getPlayer() {
        return player;
    }

    public Map<UUID, PlayerChoice> getChoices() {
        return choices;
    }

    @Override
    public String toString() {
        return "PlayerChoicePair{" +
                "player=" + player +
                ", choices=" + choices +
                '}';
    }

}
