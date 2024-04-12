package dev.ohate.wynncraft4j.model.item.meta;

import java.util.Arrays;

public class AdvancedItemFilterMeta {

    private String[] attackSpeed;
    private String[] weapons;
    private String[] armour;
    private String[] accessories;
    private String[] tomes;
    private String[] tools;
    private String[] crafting;
    private String[] gathering;

    public String[] getAccessories() {
        return accessories;
    }

    public String[] getArmour() {
        return armour;
    }

    public String[] getAttackSpeed() {
        return attackSpeed;
    }

    public String[] getCrafting() {
        return crafting;
    }

    public String[] getGathering() {
        return gathering;
    }

    public String[] getTomes() {
        return tomes;
    }

    public String[] getTools() {
        return tools;
    }

    public String[] getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return "ItemFilterAdvancedMeta{" +
                "accessories=" + Arrays.toString(accessories) +
                ", attackSpeed=" + Arrays.toString(attackSpeed) +
                ", weapons=" + Arrays.toString(weapons) +
                ", armour=" + Arrays.toString(armour) +
                ", tomes=" + Arrays.toString(tomes) +
                ", tools=" + Arrays.toString(tools) +
                ", crafting=" + Arrays.toString(crafting) +
                ", gathering=" + Arrays.toString(gathering) +
                '}';
    }

}
