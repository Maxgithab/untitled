package org.example.HomeWork9.Task1;

public class Main {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        System.out.println("======== Звуки животных после переопределения ======== ");
        rabbit.voice();
        dog.voice();
        tiger.voice();

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
    }
}