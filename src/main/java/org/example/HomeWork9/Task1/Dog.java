package org.example.HomeWork9.Task1;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Собака отвечает: ауф-ауф");
    }

     @Override
    public void eat(FoodType food) {
        switch (food) {
            case GRASS -> System.out.println("Собака ест траву. Хозяин, ты когда его последний раз кормил?");
            case CARROT -> System.out.println("Собака ест марковку. А это точно собака?");
            case MEAT -> System.out.println("Собака ест мясо");
            case BONE -> System.out.println("Вы дали собаке кость. Получен новый статус - \"Уважение пса\"");
            case UNKNOWN -> System.out.println("Это ж собака, конечно он будет есть то " + food.getName());
            default -> System.out.println("Надо проверить, будет ли есть " + food.getName());
        }
    }
}
