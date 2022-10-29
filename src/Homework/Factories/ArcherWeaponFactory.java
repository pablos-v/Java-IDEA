package Homework.Factories;

import Homework.Equipment.Weapon;

public class ArcherWeaponFactory extends WeaponFactory{

    private static final ArcherWeaponFactory INSTANCE = new ArcherWeaponFactory();

    private ArcherWeaponFactory() {
    }

    public static ArcherWeaponFactory getInstance() {
        return INSTANCE;
    }

    public Weapon makeNewBow(int level) {
        return switch (level) {
            case (1) -> new Weapon(level, "Old bow");
            case (2) -> new Weapon(level, "Long bow");
            default -> null;
        };
    }
}
