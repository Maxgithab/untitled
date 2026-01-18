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

    public class Hacker {
        String changeColor(String newColour) {
            color = newColour; // имеет доступ к private полям внешнего класса
        return newColour;
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Яблоко сейчас " + apple.getColor());

        // Шаг 3 - пытаемся изменить внутренний класс
        Apple.Hacker newApple = apple.new Hacker();
        System.out.println("Яблоко после изменения внутреннего класса сейчас " + newApple.changeColor("красное"));

    }
}