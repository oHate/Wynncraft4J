package dev.ohate.wynncraft4j.model.guild;

import java.util.Arrays;

public class GuildBanner {

    private String base;
    private int tier;
    private String structure;
    private GuildBannerPattern[] layers;

    public String getBase() {
        return base;
    }

    public int getTier() {
        return tier;
    }

    public String getStructure() {
        return structure;
    }

    public GuildBannerPattern[] getLayers() {
        return layers;
    }

    @Override
    public String toString() {
        return "GuildBanner{" +
                "base='" + base + '\'' +
                ", tier=" + tier +
                ", structure='" + structure + '\'' +
                ", layers=" + Arrays.toString(layers) +
                '}';
    }

}
