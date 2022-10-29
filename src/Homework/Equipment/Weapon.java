package Homework.Equipment;

public class Weapon extends Eqiupment {

    public int atackPower;

    public Weapon(int level, String name) {
        this.name = name;
        atackPower = level * 10;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void broken(Eqiupment breaker) {
        strengthPoints -= breaker.strength;
    }
}
