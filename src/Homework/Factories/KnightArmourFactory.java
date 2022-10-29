package Homework.Factories;

import Homework.Equipment.Armour;

public class KnightArmourFactory {
    private static final KnightArmourFactory INSTANCE = new KnightArmourFactory();

    private KnightArmourFactory() {
    }

    public static KnightArmourFactory getInstance() {
        return INSTANCE;
    }

    public Armour makeNewArmour(int level) {
        return switch (level) {
            case (1) -> new Armour(level, "Rust");
            case (2) -> new Armour(level, "Steel");
            default -> null;
        };
    }
}
