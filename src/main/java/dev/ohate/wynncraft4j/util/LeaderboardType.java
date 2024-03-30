package dev.ohate.wynncraft4j.util;

public enum LeaderboardType {
    GUILD_LEVEL("guildLevel"),
    GUILD_TERRITORIES("guildTerritories"),
    GUILD_WARS("guildWars"),
    COMBAT_GLOBAL_LEVEL("combatGlobalLevel"),
    TOTAL_GLOBAL_LEVEL("totalGlobalLevel"),
    COMBAT_SOLO_LEVEL("combatSoloLevel"),
    TOTAL_SOLO_LEVEL("totalSoloLevel"),
    PLAYER_CONTENT("playerContent"),
    WOODCUTTING_LEVEL("woodcuttingLevel"),
    PROFESSIONS_SOLO_LEVEL("professionsSoloLevel"),
    MINING_LEVEL("miningLevel"),
    FISHING_LEVEL("fishingLevel"),
    FARMING_LEVEL("farmingLevel"),
    ALCHEMISM_LEVEL("alchemismLevel"),
    ARMOURING_LEVEL("armouringLevel"),
    COOKING_LEVEL("cookingLevel"),
    JEWELING_LEVEL("jewelingLevel"),
    SCRIBING_LEVEL("scribingLevel"),
    TAILORING_LEVEL("tailoringLevel"),
    WEAPONSMITHING_LEVEL("weaponsmithingLevel"),
    WOODWORKING_LEVEL("woodworkingLevel"),
    PROFESSIONS_GLOBAL_LEVEL("professionsGlobalLevel"),
    NOG_COMPLETION("nogCompletion"),
    TCC_COMPLETION("tccCompletion"),
    NOL_COMPLETION("nolCompletion"),
    TNA_COMPLETION("tnaCompletion"),
    WARS_COMPLETION("warsCompletion"),
    IRONMAN_CONTENT("ironmanContent"),
    ULTIMATE_IRONMAN_CONTENT("ultimateIronmanContent"),
    CRAFTSMAN_CONTENT("craftsmanContent"),
    HARDCORE_LEGACY_LEVEL("hardcoreLegacyLevel"),
    HUNTED_CONTENT("huntedContent"),
    HARDCORE_CONTENT("hardcoreContent"),
    HUIC_CONTENT("huicContent"),
    HUICH_CONTENT("huichContent");

    private final String value;

    private LeaderboardType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
