package dev.ohate.wynncraft4j.model.leaderboard.type;

public enum GamemodeLeaderboardType {
    HARDCORE_LEGACY_LEVEL("hardcoreLegacyLevel"),
    HARDCORE_CONTENT("hardcoreContent"),
    HUIC_CONTENT("huicContent"),
    HUICH_CONTENT("huichContent"),
    HIC_CONTENT("hicContent"),
    HICH_CONTENT("hichContent");

    private final String id;

    private GamemodeLeaderboardType(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


}
