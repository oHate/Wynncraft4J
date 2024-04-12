package dev.ohate.wynncraft4j.model.item.meta;

public class ItemLevelMeta {

    private int items;
    private int ingredients;

    public int getIngredients() {
        return ingredients;
    }

    public int getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ItemLevelMeta{" +
                "ingredients=" + ingredients +
                ", items=" + items +
                '}';
    }

}
