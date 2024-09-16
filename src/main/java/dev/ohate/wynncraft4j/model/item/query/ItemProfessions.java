package dev.ohate.wynncraft4j.model.item.query;

public enum ItemProfessions {
    ALCHEMISM("alchemism"),
    ARMOURING("armouring"),
    COOKING("cooking"),
    JEWELING("jeweling"),
    SCRIBING("scribing"),
    TAILORING("tailoring"),
    WEAPONSMITHING("weaponsmithing"),
    WOODWORKING("woodworking"),
    MINING("mining"),
    FISHING("fishing"),
    FARMING("farming"),
    WOODCUTTING("woodcutting");

    private final String id;

    ItemProfessions(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
