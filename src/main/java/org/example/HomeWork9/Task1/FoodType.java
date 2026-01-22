package org.example.HomeWork9.Task1;

public enum FoodType {
    MEAT("Мясо"),
    GRASS("Трава"),
    CARROT("Морковь"),
    FISH("Рыба"),
    BONE("Кость"),
    UNKNOWN("Что поднял с земли");


    private final String name;

    FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
