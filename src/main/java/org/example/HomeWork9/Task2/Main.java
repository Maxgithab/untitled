package org.example.HomeWork9.Task2;

/*Написать такой конструктор, который запретит создание объекта класса Dog в других
классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
способа.*/

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        //Dog dog = new Dog(); // при Private не создать new
        Dog dog = Dog.getInstance();
        /* запрос через getInstance(), создание и возврат в единственном экземпляре */
        dog.voice();
        dog.eat();

        Dog dog2 = Dog.getInstance();
        System.out.println(dog == dog2); /* dog2 и dog - это одна и та же собака*/
        dog2.voice();
        dog2.eat();

        Constructor<Dog> constructor = Dog.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Dog dog3 = constructor.newInstance();
        System.out.println(dog == dog3); /* dog3 и dog - это разные собаки*/
        dog3.voice();
        dog3.eat();
/* getDeclaredConstructor() - получение доступа к приватному конструктору
   setAccessible(true) - отключение проверки private
   newInstance() - создание объекта через приватный конструктор
   получаем новый объект, хотя по задумке должен быть только один */
    }
}
