package dev.ohate.wynncraft4j.selection.choice;

import java.util.Map;

public class Choice<K, V> {

    private final Map<K, V> choices;

    /**
     * Constructs a new {@code Choice} object with the specified map of choices.
     *
     * @param choices A map of choices where the key is of type {@code K} and the value is of type {@code V}.
     */
    public Choice(Map<K, V> choices) {
        this.choices = choices;
    }

    /**
     * Returns the map of choices.
     *
     * @return A map containing the key-value pairs that represent the choices.
     */
    public Map<K, V> getChoices() {
        return this.choices;
    }

    /**
     * Checks if there are any choices available.
     *
     * @return {@code true} if the choices map is not null and contains at least one entry, {@code false} otherwise.
     */
    public boolean hasChoice() {
        return this.choices != null && !this.choices.isEmpty();
    }

    /**
     * Returns a string representation of the {@code Choice} object, displaying the map of choices.
     *
     * @return A string representation of the {@code Choice} object.
     */
    @Override
    public String toString() {
        return "Choice{" +
                "choices=" + this.choices +
                '}';
    }

}
