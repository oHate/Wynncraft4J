package dev.ohate.wynncraft4j.model.leaderboard.type;

public enum PlayerLeaderboardType {
    GLOBAL_PLAYER_CONTENT("globalPlayerContent"),
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
    HUNTED_CONTENT("huntedContent"),
    NOG_SR_PLAYERS("nogSrPlayers"),
    NOL_SR_PLAYERS("nolSrPlayers"),
    TCC_SR_PLAYERS("tccSrPlayers"),
    TNA_SR_PLAYERS("tnaSrPlayers");

    private final String id;

    private PlayerLeaderboardType(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

}
