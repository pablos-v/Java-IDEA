package Homework;

public class ArcherArmourFactory extends ArmourFactory{


    public static Armour makeNewArmour(int level) {
        return switch (level) {
            case (1) -> new Armour(level, "Leather");
            case (2) -> new Armour(level, "ChainMail");
            default -> null;
        };
    }
}
