package dev.ohate.wynncraft4j.model.item.query;

public enum ItemTier {
    STAR_0("0"),
    STAR_1("1"),
    STAR_2("2"),
    STAR_3("3"),
    NORMAL("common"),
    UNIQUE("unique"),
    RARE("rare"),
    LEGENDARY("legendary"),
    FABLED("fabled"),
    SET("set"),
    MYTHIC("mythic");

    private final String id;

    ItemTier(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
