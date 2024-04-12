package dev.ohate.wynncraft4j.model.item.meta;

import java.util.Arrays;

public class ItemFilterMeta {

    private String[] type;
    private AdvancedItemFilterMeta advanced;

    public AdvancedItemFilterMeta getAdvanced() {
        return advanced;
    }

    public String[] getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ItemFilterMeta{" +
                "advanced=" + advanced +
                ", type=" + Arrays.toString(type) +
                '}';
    }

}
