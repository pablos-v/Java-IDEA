package Homework;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super(a, b, 0);
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
    protected double countPerimeter() {
        return (a + b) * 2;
    }
}
