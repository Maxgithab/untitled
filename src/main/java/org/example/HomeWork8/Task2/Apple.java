package org.example.HomeWork8.Task2;

/*Создать класс Apple и добавить в него поле color с модификатором доступа private и
инициализировать его. В методе main другого класса создать объект Apple, и не
используя сеттеры, изменить значение поля color.*/

public class Apple {
    private String color = "зеленое";

    public String getColor() {
        return color;
    }

    // Сеттер (публичный метод для изменения)
    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Яблоко сейчас " + apple.getColor());
    }
}