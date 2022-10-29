package Homework;

abstract class Eqiupment {

    protected int strengthPoints;
    protected int strength;

    protected void broken(Eqiupment breaker) {
        strengthPoints -= breaker.strength;
    }
}
