package Homework;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        if (!check()) throw new RuntimeException("This figure is not possible!");
    }

    @Override
    protected boolean check() {
        return a > 0 && b > 0;
    }

    @Override
    protected double countSquare() {
        return a * b;
    }

    @Override
    protected int countPerimeter() {
        return (a + b) * 2;
    }
}
