package dev.ohate.wynncraft4j.model.guild.banner;

import java.util.Arrays;

public class Banner {

    private BannerColor base;
    private int tier;
    private String structure;
    private BannerLayer[] layers;

    /**
     * Returns the base color of the banner.
     *
     * @return the {@link BannerColor} representing the base color of the banner.
     */
    public BannerColor getBaseColor() {
        return this.base;
    }

    /**
     * Returns the tier level of the banner.
     *
     * @return the tier level of the banner.
     */
    public int getTier() {
        return this.tier;
    }

    /**
     * Returns the structure of the banner.
     *
     * @return the structure of the banner.
     */
    public String getStructure() {
        return this.structure;
    }

    /**
     * Returns an array of {@link BannerLayer} objects.
     *
     * @return an array of {@link BannerLayer} objects.
     */
    public BannerLayer[] getLayers() {
        return this.layers;
    }

    /**
     * Returns a string representation of the {@code Banner} object.
     *
     * @return a {@code String} containing the base color, tier, structure, and layers of the banner.
     */
    @Override
    public String toString() {
        return "Banner{" +
                "base='" + this.base + '\'' +
                ", tier=" + this.tier +
                ", structure='" + this.structure + '\'' +
                ", layers=" + Arrays.toString(this.layers) +
                '}';
    }

}
