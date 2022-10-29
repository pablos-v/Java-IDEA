package Homework;

public class Weapon extends Eqiupment {

    protected int atackPower;

    public Weapon(int level, String name) {
        this.name = name;
        atackPower = level * 10;
    }

    @Override
    protected void broken(Eqiupment breaker) {
        strengthPoints -= breaker.strength;
    }
}
