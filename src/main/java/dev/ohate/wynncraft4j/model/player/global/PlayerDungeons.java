package dev.ohate.wynncraft4j.model.player.global;

import java.util.Map;

public class PlayerDungeons {

    private int total;
    private Map<String, Integer> list;

    /**
     * Returns the total number of dungeons completed by the player.
     *
     * @return The total number of dungeons.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Returns a map of specific dungeon counts.
     * The keys represent the names or identifiers of the dungeons, and the values represent the counts of those dungeons.
     *
     * @return A map of dungeon counts.
     */
    public Map<String, Integer> getList() {
        return this.list;
    }

    /**
     * Returns a string representation of the {@code PlayerDungeons} object, including the total number of dungeons and the specific dungeon counts.
     *
     * @return A string representation of the {@code PlayerDungeons} object.
     */
    @Override
    public String toString() {
        return "PlayerDungeons{" +
                "total=" + this.total +
                ", list=" + this.list +
                '}';
    }

}
