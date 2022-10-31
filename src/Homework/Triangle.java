package Homework;

public class Triangle extends Figure {

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!check()) throw new RuntimeException("This figure is not possible!");
    }

    @Override
    protected double countSquare() {
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    protected int countPerimeter() {
        return a + b + c;
    }

    @Override
    protected boolean check() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
}
