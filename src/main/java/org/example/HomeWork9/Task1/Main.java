package org.example.HomeWork9.Task1;

/*
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен.
 */

public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal fish = new Fish();

        System.out.println("======== Звуки животных после переопределения ======== ");
        rabbit.voice();
        dog.voice();
        tiger.voice();
        fish.voice();

        FoodType[] foods = {
            FoodType.MEAT,
            FoodType.GRASS,
            FoodType.CARROT,
            FoodType.FISH,
            FoodType.BONE,
            FoodType.UNKNOWN
        };
        System.out.println("\nЖивотные едят");
        System.out.println("======== Кролик ========");
        for (FoodType food : foods) {
            rabbit.eat(food);
        }

        System.out.println("\n======== Собака ========");
        for (FoodType food : foods) {
            dog.eat(food);
        }

        System.out.println("\n======== Тигр ========");
        for (FoodType food : foods) {
            tiger.eat(food);
        }

        System.out.println("\n======== Рыба ========");
        for (FoodType food : foods) {
            fish.eat(food);
        }
    }
}