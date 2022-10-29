package Homework.Heroes;

import Homework.Equipment.Armour;
import Homework.Equipment.Weapon;

abstract class Hero {
    protected static int id = 0;
    protected int hp;
    public Weapon weapon;
    public Armour armour;

    public void getDamage(int hit) {
        hp = hp - (armour.blockPower - hit);
    }

    public void atack(Hero enemy) {
        enemy.getDamage(weapon.atackPower);
    }
}
