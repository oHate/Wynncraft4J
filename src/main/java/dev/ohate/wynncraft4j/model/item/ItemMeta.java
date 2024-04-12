package dev.ohate.wynncraft4j.model.item;

import dev.ohate.wynncraft4j.model.item.meta.ItemFilterMeta;
import dev.ohate.wynncraft4j.model.item.meta.ItemLevelMeta;
import dev.ohate.wynncraft4j.model.item.meta.ItemTierMeta;

import java.util.Arrays;

public class ItemMeta {

    private String[] identifications;
    private String[] majorIds;
    private ItemFilterMeta filters;
    private ItemTierMeta tier;
    private ItemLevelMeta levelRange;

    public ItemFilterMeta getFilters() {
        return filters;
    }

    public String[] getIdentifications() {
        return identifications;
    }

    public String[] getMajorIds() {
        return majorIds;
    }

    public ItemTierMeta getTier() {
        return tier;
    }

    public ItemLevelMeta getLevelRange() {
        return levelRange;
    }

    @Override
    public String toString() {
        return "ItemMeta{" +
                "filters=" + filters +
                ", identifications=" + Arrays.toString(identifications) +
                ", majorIds=" + Arrays.toString(majorIds) +
                ", tier=" + tier +
                ", levelRange=" + levelRange +
                '}';
    }

}
