package dev.ohate.wynncraft4j.model.item.query;

public enum ItemMajor {
    DIVINE_HONOR("Divine Honor"),
    GREED("Greed"),
    MAGNET("Magnet"),
    PLAGUE("Plague"),
    SAVIOURS_SACRIFICE("Saviour’s Sacrifice"),
    SORCERY("Sorcery"),
    SOUL_EATER("Soul Eater"),
    CHERRY_BOMBS("Cherry Bombs"),
    EXPUNGE("Expunge"),
    FLASHFREEZE("Flashfreeze"),
    GENTLE_GLOW("Gentle Glow"),
    GRUESOME_KNOTS("Gruesome Knots"),
    PEACEFUL_EFFIGY("Peaceful Effigy"),
    RALLY("Rally"),
    RECKLESS_ABANDON("Reckless Abandon"),
    GRAVITY_WELL("Gravity Well"),
    PERFECT_RECALL("Perfect Recall"),
    CAVALRYMAN("Cavalryman"),
    ENTROPY("Entropy"),
    ESCAPE_ROUTE("Escape Route"),
    LIGHTWEIGHT("Lightweight"),
    SNOWY_STEPS("Snowy Steps"),
    TAUNT("Taunt"),
    DEAD_WEIGHT("Dead Weight"),
    FURIOUS_EFFIGY("Furious Effigy"),
    GEOCENTRISM("Geocentrism"),
    STRINGS_OF_FATE("Strings of Fate"),
    ALTER_EGO("Alter Ego"),
    EXPLOSIVE_IMPACT("Explosive Impact"),
    FESTIVE_SPIRIT("Festive Spirit"),
    FREERUNNER("Freerunner"),
    HAWKEYE("Hawkeye"),
    TEMBLOR("Temblor"),
    WINDSURF("Windsurf"),
    JUGGLE("Juggle"),
    ROVING_ASSASSIN("Roving Assassin"),
    TRANSCENDENCE("Transcendence"),
    FISSION("Fission"),
    FORESTS_BLESSING("Forest's Blessing"),
    HEART_OF_THE_PACK("Heart of the Pack"),
    COAGULATE("Coagulate"),
    GUARDIAN("Guardian"),
    HELLFIRE("Hellfire"),
    OVERWHELM("Overwhelm"),
    LUNGE("Lunge"),
    MADNESS("Madness");

    private final String id;

    ItemMajor(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
