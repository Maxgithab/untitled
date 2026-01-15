package org.example.HomeWork7.Task3;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person();
        ivan.name = "Иван";
        ivan.age = 25;

        Person clone = ivan.clone();

        System.out.println("=== Демонстрация Cloneable ===");
        System.out.println("Имя оригинала: " + ivan);
        System.out.println("Имя клона: " + clone);
        System.out.print("Одно и то же?: ");
        System.out.println(clone == ivan);

        clone.name = "Петя";
        clone.age = 30;
        System.out.println("\n=== После изменений ===");
        System.out.println("Имя оригинала: " + ivan);
        System.out.println("Имя клона: " + clone);
    }
}
