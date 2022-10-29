package Homework;

public class Armour extends Eqiupment {

    protected int blockPower;

    public Armour(int level, String name) {
        this.name = name;
        blockPower = level * 10;
    }

    @Override
    protected void broken(Eqiupment breaker) {
        strengthPoints -= breaker.strength;
    }
}
