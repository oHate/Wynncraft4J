package dev.ohate.wynncraft4j.model.player;

public enum PlayerRank {
    UNKNOWN,
    PLAYER,
    VIP,
    VIPPLUS,
    HERO,
    CHAMPION,
    MEDIA,
    MODERATOR,
    ADMINISTRATOR,
    WEBDEV,
    GM,
    BUILD,
    CMD,
    HYBRID,
    ITEM,
    QA,
    ART;

    public static PlayerRank fromString(String name) {
        for (PlayerRank rank : values()) {
            if (rank.name().equalsIgnoreCase(name)) {
                return rank;
            }
        }

        return UNKNOWN;
    }

}
