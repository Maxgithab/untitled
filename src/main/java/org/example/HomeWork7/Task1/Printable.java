package org.example.HomeWork7.Task1;

public interface Printable {
    String getPosition();

    default void printPosition() { // ← Метод с реализацией по умолчанию!
        System.out.println("Должность: " + getPosition());
    }
}