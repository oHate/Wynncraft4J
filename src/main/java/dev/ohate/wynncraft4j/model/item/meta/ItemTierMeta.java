package dev.ohate.wynncraft4j.model.item.meta;

import java.util.Arrays;

public class ItemTierMeta {

    private String[] items;
    private Integer[] ingredients;

    public Integer[] getIngredients() {
        return ingredients;
    }

    public String[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ItemTierMeta{" +
                "ingredients=" + Arrays.toString(ingredients) +
                ", items=" + Arrays.toString(items) +
                '}';
    }

}
