package dev.ohate.wynncraft4j.model.item;

import com.google.gson.JsonObject;

import java.util.Map;

public class Item {

    private String material;
    private String tier;
    private int powderSlots;
    private String type;
    private String lore;
    private String dropRestriction;
    private String armorType;
    private String attackSpeed;
    private String internalName;
    // Nullable
    private ItemDropMeta dropMeta;
    private JsonObject base; // Needs deserializer
    private Map<String, Object> requirements; // Can either be a String or an Integer
//    private ItemIdentifications identifications; // Needs deserializer


    public String getArmorType() {
        return armorType;
    }

    public String getAttackSpeed() {
        return attackSpeed;
    }

    public JsonObject getBase() {
        return base;
    }

    public ItemDropMeta getDropMeta() {
        return dropMeta;
    }

    public String getDropRestriction() {
        return dropRestriction;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getLore() {
        return lore;
    }

    public String getMaterial() {
        return material;
    }

    public int getPowderSlots() {
        return powderSlots;
    }

    public Map<String, Object> getRequirements() {
        return requirements;
    }

    public String getTier() {
        return tier;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "armorType='" + armorType + '\'' +
                ", material='" + material + '\'' +
                ", tier='" + tier + '\'' +
                ", powderSlots=" + powderSlots +
                ", type='" + type + '\'' +
                ", lore='" + lore + '\'' +
                ", dropRestriction='" + dropRestriction + '\'' +
                ", attackSpeed='" + attackSpeed + '\'' +
                ", internalName='" + internalName + '\'' +
                ", dropMeta=" + dropMeta +
                ", base=" + base +
                ", requirements=" + requirements +
                '}';
    }

}
