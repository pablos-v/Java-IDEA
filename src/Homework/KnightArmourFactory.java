package Homework;

public class KnightArmourFactory {
    public static Armour makeNewArmour(int level) {
        return switch (level) {
            case (1) -> new Armour(level, "Rust");
            case (2) -> new Armour(level, "Steel");
            default -> null;
        };
    }
}
