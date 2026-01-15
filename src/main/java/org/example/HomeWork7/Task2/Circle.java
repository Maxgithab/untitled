package org.example.HomeWork7.Task2;

public class Circle extends Figure {
    private final double rad;

    public Circle(double rad) {
        if (rad <= 0) {
            throw new IllegalArgumentException("Самый умный, да?..");
        }
        this.rad = rad;
    }

    public double area() {
        return Math.PI * rad * rad;
    }

    public double perimeter() {
        return 2 * Math.PI * rad;
    }
}
