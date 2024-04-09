package dev.ohate.wynncraft4j.model.player.abilities;

import java.util.Arrays;
import java.util.Map;

public class PlayerAbility {

    private String type;
    private Coordinates coordinates;
    private Map<String, Object> meta;
    private String[] family;

    public String getType() {
        return type;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public String[] getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "PlayerAbility{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                ", meta=" + meta +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    public static class Coordinates {

        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Coordinates{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }

}
