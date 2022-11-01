package Homework;

public class Triangle extends Figure {

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    public double countSquare() {
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double countPerimeter() {
        return a + b + c;
    }

    public boolean check() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
}
