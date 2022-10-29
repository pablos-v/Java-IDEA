package Homework;

abstract class Hero {
    protected static int id = 0;
    protected int hp;
    protected Weapon weapon;
    protected Armour armour;

    public void getDamage(int hit) {
        hp = hp - (armour.blockPower - hit);
    }

    public void atack(Hero enemy) {
        enemy.getDamage(weapon.atackPower);
    }
}
