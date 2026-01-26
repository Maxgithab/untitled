package org.example.HomeWork10.Task2;

/*Задача *:
Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Москва", "Дальняя");
        User originalUser = new User("1", "Вася", address);
        originalUser.addFriend("Петя");
        originalUser.addFriend("Женя");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыбери тип клонирования:");
        System.out.println("1 - Поверхностное");
        System.out.println("2 - Глубокое");
        int choice = scanner.nextInt();
        User clonedUser;
        if (choice == 1) {
            clonedUser = originalUser.cloneShallow();
        } else if (choice == 2) {
            clonedUser = originalUser.cloneDeep();
        } else {
            System.out.println("Опять за старое? 1 или 2");
            scanner.close();
            return;
        }

        System.out.println("Проверка ссылок оригинала и клона");
        System.out.println("Оригинал живет в " + originalUser.getAddress().getCity() + ", ул. " + originalUser.getAddress().getStreet());
        System.out.println("Копия живет в " + clonedUser.getAddress().getCity() + ", ул. " + clonedUser.getAddress().getStreet());
        System.out.println(originalUser);
        System.out.println(clonedUser);
        System.out.println(originalUser == clonedUser);
        System.out.println(originalUser.getAddress() == clonedUser.getAddress());
        System.out.println(originalUser.getFriends() == clonedUser.getFriends());

        originalUser.getAddress().setCity("СПб");
        originalUser.getAddress().setStreet("Ближняя");//меняем адрес у оригинала
        originalUser.addFriend("Сёма"); //добавили друга

        System.out.println("\nПосле обновления данных у оригинала");
        System.out.println("Оригинал живет в " + originalUser.getAddress().getCity() + ", ул. " + originalUser.getAddress().getStreet());
        System.out.println("Копия живет в " + clonedUser.getAddress().getCity() + ", ул. " + clonedUser.getAddress().getStreet());
        System.out.println(originalUser);
        System.out.println(clonedUser);
        System.out.println(originalUser == clonedUser);
        System.out.println(originalUser.getAddress() == clonedUser.getAddress());
        System.out.println(originalUser.getFriends() == clonedUser.getFriends());


    }
}
