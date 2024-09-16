package dev.ohate.wynncraft4j.model.guild;

public class GuildSeasonRank {

    private int rating;
    private int finalTerritories;

    /**
     * Gets the rating of the guild for the season.
     *
     * @return the guild's rating for the season
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * Gets the final number of territories the guild holds at the end of the season.
     *
     * @return the final number of territories the guild holds
     */
    public int getFinalTerritories() {
        return this.finalTerritories;
    }

    /**
     * Returns a string representation of the GuildSeasonRank.
     * The string includes the guild's rating and the final number of territories held.
     *
     * @return a string representation of the GuildSeasonRank
     */
    @Override
    public String toString() {
        return "GuildSeasonRank{" +
                "rating=" + this.rating +
                ", finalTerritories=" + this.finalTerritories +
                '}';
    }

}
