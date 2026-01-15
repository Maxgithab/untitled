package org.example.HomeWork7.Task2;

public class Rectangle extends Figure {
    private double a, b;

    public Rectangle (double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Самый умный, да?..");
        }
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

}
