package Homework;

public class KnightWeaponFactory {
    public static Weapon makeNewSword(int level) {
        return switch (level) {
            case (1) -> new Weapon(level, "Old sword");
            case (2) -> new Weapon(level, "Legendary sword");
            default -> null;
        };
    }
}
