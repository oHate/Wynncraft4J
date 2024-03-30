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

    public PlayerProfession getFishing() {
        return fishing;
    }

    public PlayerProfession getWoodcutting() {
        return woodcutting;
    }

    public PlayerProfession getMining() {
        return mining;
    }

    public PlayerProfession getFarming() {
        return farming;
    }

    public PlayerProfession getScribing() {
        return scribing;
    }

    public PlayerProfession getJeweling() {
        return jeweling;
    }

    public PlayerProfession getAlchemism() {
        return alchemism;
    }

    public PlayerProfession getCooking() {
        return cooking;
    }

    public PlayerProfession getWeaponsmithing() {
        return weaponsmithing;
    }

    public PlayerProfession getTailoring() {
        return tailoring;
    }

    public PlayerProfession getWoodworking() {
        return woodworking;
    }

    public PlayerProfession getArmouring() {
        return armouring;
    }

    @Override
    public String toString() {
        return "PlayerProfessions{" +
                "fishing=" + fishing +
                ", woodcutting=" + woodcutting +
                ", mining=" + mining +
                ", farming=" + farming +
                ", scribing=" + scribing +
                ", jeweling=" + jeweling +
                ", alchemism=" + alchemism +
                ", cooking=" + cooking +
                ", weaponsmithing=" + weaponsmithing +
                ", tailoring=" + tailoring +
                ", woodworking=" + woodworking +
                ", armouring=" + armouring +
                '}';
    }

}
