package dev.ohate.wynncraft4j.model.guild;

public class GuildSeasonRank {

    private int rating;
    private int finalTerritories;

    public int getRating() {
        return rating;
    }

    public int getFinalTerritories() {
        return finalTerritories;
    }

    @Override
    public String toString() {
        return "GuildSeasonRank{" +
                "rating=" + rating +
                ", finalTerritories=" + finalTerritories +
                '}';
    }

}
