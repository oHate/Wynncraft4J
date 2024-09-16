package dev.ohate.wynncraft4j.model.player;

import java.awt.*;

public class PlayerLegacyRankColour {

    private Color main;
    private Color sub;

    /**
     * Returns the main color associated with the player's legacy rank.
     *
     * @return The main color.
     */
    public Color getMain() {
        return this.main;
    }

    /**
     * Returns the secondary color associated with the player's legacy rank.
     *
     * @return The secondary color.
     */
    public Color getSub() {
        return this.sub;
    }

    /**
     * Returns a string representation of the {@code PlayerLegacyRankColour} object.
     * <p>
     * The string includes the main and secondary colors.
     *
     * @return A string representation of the legacy rank colors.
     */
    @Override
    public String toString() {
        return "PlayerLegacyRankColour{" +
                "main=" + this.main +
                ", sub=" + this.sub +
                '}';
    }

}
