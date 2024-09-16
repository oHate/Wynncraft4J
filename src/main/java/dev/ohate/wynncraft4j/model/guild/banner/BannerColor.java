package dev.ohate.wynncraft4j.model.guild.banner;

import java.awt.*;

public enum BannerColor {
    WHITE(new Color(186, 191, 190)),
    ORANGE(new Color(187, 96, 22)),
    MAGENTA(new Color(147, 58, 140)),
    LIGHT_BLUE(new Color(44, 135, 164)),
    YELLOW(new Color(189, 160, 45)),
    LIME(new Color(94, 146, 23)),
    PINK(new Color(184, 105, 129)),
    GRAY(new Color(52, 58, 60)),
    LIGHT_GRAY(new Color(116, 116, 112)),
    CYAN(new Color(17, 118, 118)),
    PURPLE(new Color(102, 37, 137)),
    BLUE(new Color(45, 51, 128)),
    BROWN(new Color(96, 61, 37)),
    GREEN(new Color(69, 91, 16)),
    RED(new Color(133, 35, 29)),
    BLACK(new Color(21, 21, 24));

    private final Color color;

    /**
     * Constructs a {@code BannerColor} with the given {@link Color}.
     *
     * @param color the {@link Color} object representing the RGB value of the banner color
     */
    private BannerColor(Color color) {
        this.color = color;
    }

    /**
     * Returns the {@link Color} object associated with the banner color.
     *
     * @return the {@link Color} object representing the RGB value of the banner color
     */
    public Color getColor() {
        return this.color;
    }

}
