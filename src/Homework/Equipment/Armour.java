package Homework.Equipment;

public class Armour extends Eqiupment {

    public int blockPower;

    public Armour(int level, String name) {
        this.name = name;
        blockPower = level * 10;
    }

    public String getName() {
        return name;
    }
    @Override
    protected void broken(Eqiupment breaker) {
        strengthPoints -= breaker.strength;
    }
}
