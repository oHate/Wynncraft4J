package dev.ohate.wynncraft4j.model.player.abilities;

import java.util.Arrays;

public class PlayerAbilities {

    private int pages;
    private PlayerAbility[] map;

    public int getPages() {
        return pages;
    }

    public PlayerAbility[] getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "PlayerAbilities{" +
                "pages=" + pages +
                ", map=" + Arrays.toString(map) +
                '}';
    }

}
