package Homework;

abstract class Figure implements CountSquare, CountPerimeter, Checker{

    protected int a, b, c;

    public Figure(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!check()) throw new RuntimeException("This figure is not possible!");
    }
}
