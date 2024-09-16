package dev.ohate.wynncraft4j.model.player.character;

public class PlayerProfessions {

    private PlayerProfession fishing;
    private PlayerProfession woodcutting;
    private PlayerProfession mining;
    private PlayerProfession farming;
    private PlayerProfession scribing;
    private PlayerProfession jeweling;
    private PlayerProfession alchemism;
    private PlayerProfession cooking;
    private PlayerProfession weaponsmithing;
    private PlayerProfession tailoring;
    private PlayerProfession woodworking;
    private PlayerProfession armouring;

    /**
     * Returns the player's progress in the Fishing profession.
     *
     * @return The {@link PlayerProfession} object representing the Fishing profession.
     */
    public PlayerProfession getFishing() {
        return this.fishing;
    }

    /**
     * Returns the player's progress in the Woodcutting profession.
     *
     * @return The {@link PlayerProfession} object representing the Woodcutting profession.
     */
    public PlayerProfession getWoodcutting() {
        return this.woodcutting;
    }

    /**
     * Returns the player's progress in the Mining profession.
     *
     * @return The {@link PlayerProfession} object representing the Mining profession.
     */
    public PlayerProfession getMining() {
        return this.mining;
    }

    /**
     * Returns the player's progress in the Farming profession.
     *
     * @return The {@link PlayerProfession} object representing the Farming profession.
     */
    public PlayerProfession getFarming() {
        return this.farming;
    }

    /**
     * Returns the player's progress in the Scribing profession.
     *
     * @return The {@link PlayerProfession} object representing the Scribing profession.
     */
    public PlayerProfession getScribing() {
        return this.scribing;
    }

    /**
     * Returns the player's progress in the Jeweling profession.
     *
     * @return The {@link PlayerProfession} object representing the Jeweling profession.
     */
    public PlayerProfession getJeweling() {
        return this.jeweling;
    }

    /**
     * Returns the player's progress in the Alchemism profession.
     *
     * @return The {@link PlayerProfession} object representing the Alchemism profession.
     */
    public PlayerProfession getAlchemism() {
        return this.alchemism;
    }

    /**
     * Returns the player's progress in the Cooking profession.
     *
     * @return The {@link PlayerProfession} object representing the Cooking profession.
     */
    public PlayerProfession getCooking() {
        return this.cooking;
    }

    /**
     * Returns the player's progress in the Weaponsmithing profession.
     *
     * @return The {@link PlayerProfession} object representing the Weaponsmithing profession.
     */
    public PlayerProfession getWeaponsmithing() {
        return this.weaponsmithing;
    }

    /**
     * Returns the player's progress in the Tailoring profession.
     *
     * @return The {@link PlayerProfession} object representing the Tailoring profession.
     */
    public PlayerProfession getTailoring() {
        return this.tailoring;
    }

    /**
     * Returns the player's progress in the Woodworking profession.
     *
     * @return The {@link PlayerProfession} object representing the Woodworking profession.
     */
    public PlayerProfession getWoodworking() {
        return this.woodworking;
    }

    /**
     * Returns the player's progress in the Armouring profession.
     *
     * @return The {@link PlayerProfession} object representing the Armouring profession.
     */
    public PlayerProfession getArmouring() {
        return this.armouring;
    }

    /**
     * Returns a string representation of the {@code PlayerProfessions} object,
     * showing the player's progress in each profession.
     *
     * @return A string representation of the {@code PlayerProfessions} object.
     */
    @Override
    public String toString() {
        return "PlayerProfessions{" +
                "fishing=" + this.fishing +
                ", woodcutting=" + this.woodcutting +
                ", mining=" + this.mining +
                ", farming=" + this.farming +
                ", scribing=" + this.scribing +
                ", jeweling=" + this.jeweling +
                ", alchemism=" + this.alchemism +
                ", cooking=" + this.cooking +
                ", weaponsmithing=" + this.weaponsmithing +
                ", tailoring=" + this.tailoring +
                ", woodworking=" + this.woodworking +
                ", armouring=" + this.armouring +
                '}';
    }

}
