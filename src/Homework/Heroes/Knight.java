package Homework.Heroes;

import Homework.Factories.KnightArmourFactory;
import Homework.Factories.KnightWeaponFactory;

public class Knight extends Hero{

    public Knight(int level) {
        hp = 50;
        id = id + 1;
        weapon = KnightWeaponFactory.getInstance().makeNewSword(level);
        armour = KnightArmourFactory.getInstance().makeNewArmour(level);
    }
}
