package Homework;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Figure> array = new ArrayList<>();

        array.add(new Triangle(2,3,4));
        array.add(new Circle(12));
        array.add(new Rectangle(4,1));
        array.add(new Square(2));

        double squareSum = 0;
        for (Figure figure:array             ) {
            squareSum += figure.countSquare();
        }
        System.out.println(squareSum);

        double perimeterSum = 0;
        for (Figure figure:array             ) {
            perimeterSum += figure.countPerimeter();
        }
        System.out.println(perimeterSum);
    }
}
