package Homework;

public class Circle extends Figure {

    public Circle(int a) {
        this.a = a;
        if (!check()) throw new RuntimeException("This figure is not possible!");
    }

    @Override
    protected double countSquare() {
        return 0;
    }

    @Override
    protected int countPerimeter() {
        return 0;
    }

    @Override
    protected boolean check() {
        return a > 0;
    }
}
