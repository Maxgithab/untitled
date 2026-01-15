package org.example.HomeWork7.Task2;

/*Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра
используя периметра всех фигур в массиве.*/

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[0] = new Rectangle(5.4, 10.2);
        figures[1] = new Circle(8.6);
        figures[2] = new Triangle(7.4, 1.9, 6.2);
        figures[3] = new Rectangle(7.7, 10.0);
        figures[4] = new Circle(4.1);
        figures[5] = new Triangle(2.2, 3.3, 4.4);

        double totalPer = 0;
        double totalArea = 0;

        for (Figure figure : figures) {
            totalPer += figure.perimeter();
            totalArea += figure.area();
        }
        System.out.printf("Сумма периметров: %.2f\n", totalPer);
        System.out.printf("Сумма площадей: %.2f\n", totalArea);
    }
}