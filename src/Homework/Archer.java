package Homework;

public class Archer extends Hero {

    public Archer(int level) {
        hp = 50;
        id = id + 1;
        weapon = ArcherWeaponFactory.makeNewBow(level);
        armour = ArcherArmourFactory.makeNewArmour(level);
    }
}
