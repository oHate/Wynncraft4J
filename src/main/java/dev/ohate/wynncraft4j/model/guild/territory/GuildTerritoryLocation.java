package dev.ohate.wynncraft4j.model.guild.territory;

import java.util.Arrays;

public class GuildTerritoryLocation {

    private Integer[] start;
    private Integer[] end;

    private int getStartX() {
        return start[0];
    }

    private int getStartY() {
        return start[1];
    }

    private int getEndX() {
        return end[0];
    }

    private int getEndY() {
        return end[1];
    }

    public Integer[] getStart() {
        return start;
    }

    public Integer[] getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "GuildTerritoryLocation{" +
                "start=" + Arrays.toString(start) +
                ", end=" + Arrays.toString(end) +
                '}';
    }

}
