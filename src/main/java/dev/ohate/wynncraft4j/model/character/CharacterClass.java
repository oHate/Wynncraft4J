package dev.ohate.wynncraft4j.model.character;

public class CharacterClass {

    private CharacterType type;
    private CharacterType donorType;
    private int overallDifficulty;

    /**
     * Gets the type of the character.
     *
     * @return the type of the character
     */
    public CharacterType getType() {
        return this.type;
    }

    /**
     * Gets the donor type of the character.
     *
     * @return the donor type of the character
     */
    public CharacterType getDonorType() {
        return this.donorType;
    }

    /**
     * Gets the overall difficulty level of the character.
     *
     * @return the overall difficulty level
     */
    public int getOverallDifficulty() {
        return this.overallDifficulty;
    }

    /**
     * Returns a string representation of the character class.
     * The string includes the type, donor type, and overall difficulty.
     *
     * @return a string representation of the character class
     */
    @Override
    public String toString() {
        return "CharacterClass{" +
                "type=" + this.type +
                ", donorType=" + this.donorType +
                ", overallDifficulty=" + this.overallDifficulty +
                '}';
    }

}
