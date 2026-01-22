package org.example.HomeWork9.Task1;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр не волк, отвечать не будет");
    }

    @Override
    public void eat(FoodType food) {
        switch (food) {
            case GRASS -> System.out.println("Тигр не ест траву, не положено");
            case CARROT -> System.out.println("Тигр ест марковку. Какой-то странный тигр попался...");
            case MEAT -> System.out.println("Тигр ест мясо");
            case FISH -> System.out.println("Тигр не в восторге, но всё же ест " + food.getName());
            default -> System.out.println("Надо проверить, будет ли есть " + food.getName());
        }
    }
}
