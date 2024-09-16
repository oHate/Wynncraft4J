package dev.ohate.wynncraft4j.model.player.global;

import java.util.Map;

public class PlayerRaids {

    private int total;
    private Map<String, Integer> list;

    /**
     * Returns the total number of raids completed by the player.
     *
     * @return The total number of raids.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Returns a map of specific raid counts.
     * The keys represent the names or identifiers of the raids, and the values represent the counts of those raids.
     *
     * @return A map of raid counts.
     */
    public Map<String, Integer> getList() {
        return this.list;
    }

    /**
     * Returns a string representation of the {@code PlayerRaids} object, including the total number of raids and the specific raid counts.
     *
     * @return A string representation of the {@code PlayerRaids} object.
     */
    @Override
    public String toString() {
        return "PlayerRaids{" +
                "total=" + this.total +
                ", list=" + this.list +
                '}';
    }

}
