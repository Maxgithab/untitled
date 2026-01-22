package org.example.HomeWork9.Task1;

public class Rabbit extends Animal {

    @Override
    public void voice() {
        System.out.println("Звуки кролика");
    }

    @Override
    public void eat(FoodType food) {
        switch (food) {
            case GRASS -> System.out.println("Кролик ест траву");
            case CARROT -> System.out.println("Кролик ест марковку");
            case MEAT -> System.out.println("Вроде ест мясо. Хм, а это точно Кролик?");
            default -> System.out.println("Надо проверить, будет ли есть " + food.getName());
        }
    }
}
