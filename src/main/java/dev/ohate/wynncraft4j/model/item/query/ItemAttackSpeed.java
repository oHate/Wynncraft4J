package dev.ohate.wynncraft4j.model.item.query;

public enum ItemAttackSpeed {
    SUPER_SLOW("super_slow"),
    VERY_SLOW("very_slow"),
    SLOW("slow"),
    NORMAL("normal"),
    FAST("fast"),
    VERY_FAST("very_fast"),
    SUPER_FAST("super_fast");

    private final String id;

    ItemAttackSpeed(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
