package Homework.Factories;

import Homework.Equipment.Armour;

public class ArcherArmourFactory extends ArmourFactory {


    private static final ArcherArmourFactory INSTANCE = new ArcherArmourFactory();

    private ArcherArmourFactory() {
    }

    public static ArcherArmourFactory getInstance() {
        return INSTANCE;
    }

    public Armour makeNewArmour(int level) {
        return switch (level) {
            case (1) -> new Armour(level, "Leather");
            case (2) -> new Armour(level, "ChainMail");
            default -> null;
        };
    }
}
