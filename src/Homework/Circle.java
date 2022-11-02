package Homework;

public class Circle extends Figure {

    public Circle(int a) {
        super(a, 0, 0);
        hasPerimeter = false;
    }

    public double countSquare() {
        return Math.pow(Math.PI, a);
    }

    public double countPerimeter() {
        return 0;
    }

    public boolean check() {
        return a > 0;
    }
}
