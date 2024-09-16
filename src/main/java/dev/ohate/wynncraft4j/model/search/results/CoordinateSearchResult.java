package dev.ohate.wynncraft4j.model.search.results;

import java.util.Arrays;

public class CoordinateSearchResult {

    private String name;
    private int[] start;
    private int[] end;

    /**
     * Gets the name of the location.
     *
     * @return the name of the location.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the X coordinate of the starting point.
     *
     * @return the X coordinate of the start.
     */
    public int getStartX() {
        return this.start[0];
    }

    /**
     * Gets the Z coordinate of the starting point.
     *
     * @return the Z coordinate of the start.
     */
    public int getStartZ() {
        return this.start[1];
    }

    /**
     * Gets the X coordinate of the ending point.
     *
     * @return the X coordinate of the end.
     */
    public int getEndX() {
        return this.end[0];
    }

    /**
     * Gets the Z coordinate of the ending point.
     *
     * @return the Z coordinate of the end.
     */
    public int getEndZ() {
        return this.end[1];
    }

    /**
     * Returns a string representation of the CoordinateSearchResult.
     * The string includes the name, start coordinates, and end coordinates.
     *
     * @return a string representation of the CoordinateSearchResult.
     */
    @Override
    public String toString() {
        return "CoordinateSearchResult{" +
                "name='" + this.name + '\'' +
                ", start=" + Arrays.toString(this.start) +
                ", end=" + Arrays.toString(this.end) +
                '}';
    }

}
