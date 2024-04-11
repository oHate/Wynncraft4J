package dev.ohate.wynncraft4j.model.item.query;

public enum ItemType {
    WEAPONS("weapons"),
    ARMOUR("armour"),
    ACCESSORIES("accessories"),
    TOMES("tomes"),
    CHARMS("charms"),
    TOOLS("tools"),
    INGREDIENTS("ingredients"),
    MATERIALS("materials"),
    BOW("bow"),
    RELIK("relik"),
    WAND("wand"),
    DAGGER("dagger"),
    SPEAR("spear"),
    HELMET("helmet"),
    CHESTPLATE("chestplate"),
    LEGGINGS("leggings"),
    BOOTS("boots"),
    NECKLACE("necklace"),
    RING("ring"),
    BRACELET("bracelet"),
    WEAPON_TOME("weaponTome"),
    ARMOUR_TOME("armourTome"),
    SLAYING_TOME("slayingTome"),
    DUNGEON_TOME("dungeonTome"),
    GATHERING_TOME("gatheringTome"),
    GUILD_TOME("guildTome"),
    LOOTRUN_TOME("lootrunTome"),
    AXE("axe"),
    PICKAXE("pickaxe"),
    ROD("rod"),
    SCYTHE("scythe");

    private final String id;

    ItemType(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
