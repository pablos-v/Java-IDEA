package Homework;

public class ArcherWeaponFactory extends WeaponFactory{


    public static Weapon makeNewBow(int level) {
        return switch (level) {
            case (1) -> new Weapon(level, "Old bow");
            case (2) -> new Weapon(level, "Long bow");
            default -> null;
        };
    }
}
