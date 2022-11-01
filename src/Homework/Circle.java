package Homework;

public class Circle extends Figure {

    public Circle(int a) {
        super(a, 0, 0);
    }

    @Override
    protected double countSquare() {
        return Math.pow(Math.PI, a);
    }

    @Override
    protected double countPerimeter() {
        return 2 * Math.PI * a;
    }

    @Override
    protected boolean check() {
        return a > 0;
    }
}
