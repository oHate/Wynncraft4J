package dev.ohate.wynncraft4j.model.item.query;

import dev.ohate.wynncraft4j.util.Utilities;

public class ItemQuery {

    private String query;
    private ItemType[] type;
    private ItemTier[] tier;
    private ItemAttackSpeed[] attackSpeed;
    private Integer[] levelRange;
    private ItemProfessions[] professions;
    private ItemIdentifications[] identifications;
    private ItemMajor[] majorIds;

    private ItemQuery(String query,
                      ItemType[] type,
                      ItemTier[] tier,
                      ItemAttackSpeed[] attackSpeed,
                      Integer[] levelRange,
                      ItemProfessions[] professions,
                      ItemIdentifications[] identifications,
                      ItemMajor[] majorIds) {
        this.query = query;
        this.type = type;
        this.tier = tier;
        this.attackSpeed = attackSpeed;
        this.levelRange = levelRange;
        this.professions = professions;
        this.identifications = identifications;
        this.majorIds = majorIds;
    }

    @Override
    public String toString() {
        return Utilities.GSON.toJson(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String query = "";
        private ItemType[] type = new ItemType[0];
        private ItemTier[] tier = new ItemTier[0];
        private ItemAttackSpeed[] attackSpeed = new ItemAttackSpeed[0];
        private final Integer[] levelRange = new Integer[]{0, 110};
        private ItemProfessions[] professions = new ItemProfessions[0];
        private ItemIdentifications[] identifications = new ItemIdentifications[0];
        private ItemMajor[] majorIds = new ItemMajor[0];

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder withTypes(ItemType... types) {
            this.type = types;
            return this;
        }

        public Builder withTiers(ItemTier... tiers) {
            this.tier = tiers;
            return this;
        }

        public Builder withAttackSpeeds(ItemAttackSpeed... attackSpeeds) {
            this.attackSpeed = attackSpeeds;
            return this;
        }

        public Builder withRange(int min, int max) {
            if (min < 0) max = 0;
            if (max > 110) max = 110;
            if (min > max) min = max;

            levelRange[0] = min;
            levelRange[1] = max;

            return this;
        }

        public Builder withProfessions(ItemProfessions... professions) {
            this.professions = professions;
            return this;
        }

        public Builder withIdentifications(ItemIdentifications... identifications) {
            this.identifications = identifications;
            return this;
        }

        public Builder withMajors(ItemMajor... majors) {
            this.majorIds = majors;
            return this;
        }

        public ItemQuery build() {
            return new ItemQuery(query, type, tier, attackSpeed, levelRange, professions, identifications, majorIds);
        }

    }

}
