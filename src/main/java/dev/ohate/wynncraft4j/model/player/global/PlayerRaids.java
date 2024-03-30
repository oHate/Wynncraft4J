package dev.ohate.wynncraft4j.model.player.global;

import java.util.Map;

public class PlayerRaids {

    private int total;
    private Map<String, Integer> list;

    public int getTotal() {
        return total;
    }

    public Map<String, Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "PlayerRaids{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }

}
