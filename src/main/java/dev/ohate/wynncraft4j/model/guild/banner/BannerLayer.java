package dev.ohate.wynncraft4j.model.guild.banner;

public class BannerLayer {

    private BannerColor colour;
    private BannerPattern pattern;

    /**
     * Returns the color of the banner layer.
     *
     * @return the {@link BannerColor} representing the color of the banner layer.
     */
    public BannerColor getColour() {
        return this.colour;
    }

    /**
     * Returns the pattern of the banner layer.
     *
     * @return the {@link BannerPattern} representing the pattern of the banner layer.
     */
    public BannerPattern getPattern() {
        return this.pattern;
    }

    /**
     * Returns a string representation of the {@code BannerLayer} object.
     *
     * @return a {@code String} containing the color and pattern of the banner layer.
     */
    @Override
    public String toString() {
        return "BannerLayer{" +
                "colour='" + this.colour + '\'' +
                ", pattern='" + this.pattern + '\'' +
                '}';
    }

}
