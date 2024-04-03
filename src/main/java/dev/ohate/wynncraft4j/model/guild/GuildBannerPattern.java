package dev.ohate.wynncraft4j.model.guild;

public class GuildBannerPattern {

    private String colour;
    private String pattern;

    public String getColour() {
        return colour;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "GuildBannerPattern{" +
                "colour='" + colour + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }

}
