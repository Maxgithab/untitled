package org.example.HomeWork8.Task2;

/*Создать класс Apple и добавить в него поле color с модификатором доступа private и
инициализировать его. В методе main другого класса создать объект Apple, и не
используя сеттеры, изменить значение поля color.*/

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Яблоко всё ещё " + apple.getColor());

        // Шаг 1 - пытаемся изменить напрямую, выдает ошибку
        // apple.color = "красное"; //'color' has private access in 'org.example.HomeWork8.Task2.Apple'

        // Шаг 2 - пытаемся изменить через сеттер
        apple.setColor("красное");
        System.out.println("Теперь яблоко " + apple.getColor());

    }
}
