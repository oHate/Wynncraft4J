package dev.ohate.wynncraft4j.model.item.query;

public enum ItemIdentifications {
    FIRST_SPELL_COST("1stSpellCost"),
    SECOND_SPELL_COST("2ndSpellCost"),
    THIRD_SPELL_COST("3rdSpellCost"),
    FOURTH_SPELL_COST("4thSpellCost"),
    AIR_DAMAGE("airDamage"),
    AIR_DEFENCE("airDefence"),
    AIR_MAIN_ATTACK_DAMAGE("airMainAttackDamage"),
    AIR_SPELL_DAMAGE("airSpellDamage"),
    DAMAGE_FROM_MOBS("damageFromMobs"),
    EARTH_DAMAGE("earthDamage"),
    EARTH_DEFENCE("earthDefence"),
    EARTH_MAIN_ATTACK_DAMAGE("earthMainAttackDamage"),
    EARTH_SPELL_DAMAGE("earthSpellDamage"),
    ELEMENTAL_DAMAGE("elementalDamage"),
    ELEMENTAL_DEFENCE("elementalDefence"),
    ELEMENTAL_DEFENSE("elementalDefense"),
    ELEMENTAL_SPELL_DAMAGE("elementalSpellDamage"),
    EXPLODING("exploding"),
    FIRE_DAMAGE("fireDamage"),
    FIRE_DEFENCE("fireDefence"),
    FIRE_SPELL_DAMAGE("fireSpellDamage"),
    GATHER_SPEED("gatherSpeed"),
    GATHER_XP_BONUS("gatherXpBonus"),
    HEALING("healing"),
    HEALING_EFFICIENCY("healingEfficiency"),
    HEALTH_REGEN("healthRegen"),
    HEALTH_REGEN_RAW("healthRegenRaw"),
    JUMP_HEIGHT("jumpHeight"),
    KNOCKBACK("knockback"),
    LEVELED_LOOT_BONUS("leveledLootBonus"),
    LEVELED_XP_BONUS("leveledXpBonus"),
    LIFE_STEAL("lifeSteal"),
    LOOT_BONUS("lootBonus"),
    LOOT_QUALITY("lootQuality"),
    MAIN_ATTACK_DAMAGE("mainAttackDamage"),
    MANA_REGEN("manaRegen"),
    MANA_STEAL("manaSteal"),
    POISON("poison"),
    RAW_FIRST_SPELL_COST("raw1stSpellCost"),
    RAW_SECOND_SPELL_COST("raw2ndSpellCost"),
    RAW_THIRD_SPELL_COST("raw3rdSpellCost"),
    RAW_FOURTH_SPELL_COST("raw4thSpellCost"),
    RAW_AGILITY("rawAgility"),
    RAW_AIR_DAMAGE("rawAirDamage"),
    RAW_AIR_MAIN_ATTACK_DAMAGE("rawAirMainAttackDamage"),
    RAW_AIR_SPELL_DAMAGE("rawAirSpellDamage"),
    RAW_ATTACK_SPEED("rawAttackSpeed"),
    RAW_DEFENCE("rawDefence"),
    RAW_DEXTERITY("rawDexterity"),
    RAW_EARTH_DAMAGE("rawEarthDamage"),
    RAW_EARTH_MAIN_ATTACK_DAMAGE("rawEarthMainAttackDamage"),
    RAW_EARTH_SPELL_DAMAGE("rawEarthSpellDamage"),
    RAW_ELEMENTAL_DAMAGE("rawElementalDamage"),
    RAW_ELEMENTAL_MAIN_ATTACK_DAMAGE("rawElementalMainAttackDamage"),
    RAW_ELEMENTAL_SPELL_DAMAGE("rawElementalSpellDamage"),
    RAW_FIRE_DAMAGE("rawFireDamage"),
    RAW_FIRE_MAIN_ATTACK_DAMAGE("rawFireMainAttackDamage"),
    RAW_FIRE_SPELL_DAMAGE("rawFireSpellDamage"),
    RAW_HEALTH("rawHealth"),
    RAW_INTELLIGENCE("rawIntelligence"),
    RAW_MAIN_ATTACK_DAMAGE("rawMainAttackDamage"),
    RAW_NEUTRAL_DAMAGE("rawNeutralDamage"),
    RAW_NEUTRAL_SPELL_DAMAGE("rawNeutralSpellDamage"),
    RAW_SPELL_DAMAGE("rawSpellDamage"),
    RAW_STRENGTH("rawStrength"),
    RAW_THUNDER_DAMAGE("rawThunderDamage"),
    RAW_THUNDER_MAIN_ATTACK_DAMAGE("rawThunderMainAttackDamage"),
    RAW_THUNDER_SPELL_DAMAGE("rawThunderSpellDamage"),
    RAW_WATER_DAMAGE("rawWaterDamage"),
    RAW_WATER_MAIN_ATTACK_DAMAGE("rawWaterMainAttackDamage"),
    RAW_WATER_SPELL_DAMAGE("rawWaterSpellDamage"),
    REFLECTION("reflection"),
    SLOW_ENEMY("slowEnemy"),
    SOUL_POINT_REGEN("soulPointRegen"),
    SPELL_DAMAGE("spellDamage"),
    SPRINT("sprint"),
    SPRINT_REGEN("sprintRegen"),
    STEALING("stealing"),
    THORNS("thorns"),
    THUNDER_DAMAGE("thunderDamage"),
    THUNDER_DEFENCE("thunderDefence"),
    THUNDER_MAIN_ATTACK_DAMAGE("thunderMainAttackDamage"),
    THUNDER_SPELL_DAMAGE("thunderSpellDamage"),
    WALK_SPEED("walkSpeed"),
    WATER_DAMAGE("waterDamage"),
    WATER_DEFENCE("waterDefence"),
    WATER_SPELL_DAMAGE("waterSpellDamage"),
    WEAKEN_ENEMY("weakenEnemy"),
    XP_BONUS("xpBonus");

    private final String id;

    ItemIdentifications(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

}
