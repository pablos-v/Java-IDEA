package Homework;

abstract class Figure {

    protected int a, b, c;
    protected boolean hasPerimeter = true;

    public Figure(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!check()) throw new RuntimeException("This figure is not possible!");
    }

    abstract protected double countSquare();

    abstract protected double countPerimeter();

    abstract protected boolean check();
}
