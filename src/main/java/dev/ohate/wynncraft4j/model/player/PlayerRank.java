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
    ADMINISTRATOR;

    public static PlayerRank fromString(String name) {
        for (PlayerRank rank : values()) {
            if (rank.name().equalsIgnoreCase(name)) {
                return rank;
            }
        }

        return UNKNOWN;
    }

}
