package org.example.HomeWork7.Task1;

/* Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы.*/

public class Main {
    public static void main(String[] args) {
        Printable slave = new Laborer();
        Printable bigBoss = new Director();
        Printable moneyHolder = new Accountant();

        slave.printPosition();
        bigBoss.printPosition();
        moneyHolder.printPosition();
    }
}