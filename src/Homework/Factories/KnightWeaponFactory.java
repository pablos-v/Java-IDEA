package Homework.Factories;

import Homework.Equipment.Weapon;

public class KnightWeaponFactory {

    private static final KnightWeaponFactory INSTANCE = new KnightWeaponFactory();

    private KnightWeaponFactory() {
    }

    public static KnightWeaponFactory getInstance() {
        return INSTANCE;
    }

    public Weapon makeNewSword(int level) {
        return switch (level) {
            case (1) -> new Weapon(level, "Old sword");
            case (2) -> new Weapon(level, "Legendary sword");
            default -> null;
        };
    }
}
