package Homework;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super(a, b, 0);
    }


    public double countSquare() {
        return a * b;
    }

    public double countPerimeter() {
        return (a + b) * 2;
    }

    public boolean check() {
        return a > 0 && b > 0;
    }
}
