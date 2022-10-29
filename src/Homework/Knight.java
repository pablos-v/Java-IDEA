package Homework;

public class Knight extends Hero{

    public Knight(int level) {
        hp = 50;
        id = id + 1;
        weapon = KnightWeaponFactory.makeNewSword(level);
        armour = KnightArmourFactory.makeNewArmour(level);
    }
}
