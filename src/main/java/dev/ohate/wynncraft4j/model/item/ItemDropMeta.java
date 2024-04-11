package dev.ohate.wynncraft4j.model.item;

import java.util.Arrays;

public class ItemDropMeta {

    private Integer[] coordinates;
    private String name;
    private String type;

    public Integer[] getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ItemDropMeta{" +
                "coordinates=" + Arrays.toString(coordinates) +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
