package dev.ohate.wynncraft4j.model.leaderboard.type;

public enum GuildLeaderboardType {
    NOG_SR_GUILDS("nogSrGuilds"),
    NOL_SR_GUILDS("nolSrGuilds"),
    TCC_SR_GUILDS("tccSrGuilds"),
    TNA_SR_GUILDS("tnaSrGuilds"),
    GUILD_LEVEL("guildLevel"),
    GUILD_TERRITORIES("guildTerritories"),
    GUILD_WARS("guildWars");

    private final String id;

    private GuildLeaderboardType(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

}
