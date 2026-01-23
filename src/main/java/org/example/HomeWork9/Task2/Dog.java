package org.example.HomeWork9.Task2;

public class Dog {

    private static Dog instance;

    private Dog() {
        System.out.println("Один собака");
    }

    public static Dog getInstance() {
        if (instance == null) {
            instance = new Dog();
        }
        return instance;
    }

    public void voice() {
        System.out.println("Ауф!");
    }

    public void eat() {
        System.out.println("Собака ест");
    }
}
