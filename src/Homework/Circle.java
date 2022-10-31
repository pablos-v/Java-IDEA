package Homework;

public class Circle extends Figure {

    public Circle(int a) {
        this.a = a;
        if (!check()) throw new RuntimeException("This figure is not possible!");
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
