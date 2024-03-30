package dev.ohate.wynncraft4j.model.player;

public class PlayerGuild {

    private String name;
    private String prefix;
    private String rank;
    private String rankStars;

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getRank() {
        return rank;
    }

    public String getRankStars() {
        return rankStars;
    }

    @Override
    public String toString() {
        return "PlayerGuild{" +
                "name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", rank='" + rank + '\'' +
                ", rankStars='" + rankStars + '\'' +
                '}';
    }

}
