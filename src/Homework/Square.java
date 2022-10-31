package Homework;

public class Square extends Figure {

    public Square(int a) {
        this.a = a;
        if (!check()) throw new RuntimeException("This figure is not possible!");
    }

    @Override
    protected boolean check() {
        return a > 0;
    }

    @Override
    protected double countSquare() {
        return a * a;
    }

    @Override
    protected int countPerimeter() {
        return a * 4;
    }
}
