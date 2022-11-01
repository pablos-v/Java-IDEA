package Homework;

public class Circle extends Figure {

    public Circle(int a) {
        super(a, 0, 0);
    }

    public double countSquare() {
        return Math.pow(Math.PI, a);
    }

    public double countPerimeter() {
        return 2 * Math.PI * a;
    }

    public boolean check() {
        return a > 0;
    }
}
