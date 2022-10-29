package Homework.Heroes;

import Homework.Factories.ArcherArmourFactory;
import Homework.Factories.ArcherWeaponFactory;

public class Archer extends Hero {

    public Archer(int level) {
        hp = 50;
        id = id + 1;
        weapon = ArcherWeaponFactory.getInstance().makeNewBow(level);
        armour = ArcherArmourFactory.getInstance().makeNewArmour(level);
    }
}
