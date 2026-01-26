package org.example.HomeWork10.Task2;

/*Задача *:
Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования.*/

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Москва", "Дальняя");
        User originalUser = new User("1", "Вася", address);
        originalUser.addFriend("Петя");
        originalUser.addFriend("Женя");

        User shallowUser = originalUser.cloneShallow();

        System.out.println("Проверка ссылок");
        System.out.println(originalUser);
        System.out.println(shallowUser);
        System.out.println(originalUser == shallowUser);
        System.out.println(originalUser.getAddress() == shallowUser.getAddress());
        System.out.println(originalUser.getFriends() == shallowUser.getFriends());

        originalUser.getAddress().setCity("СПб");
        originalUser.getAddress().setStreet("Ближняя");//меняем адрес у оригинала
        originalUser.addFriend("Сёма"); //добавили друга

        System.out.println("\nПосле добавления");
        System.out.println(originalUser);
        System.out.println(shallowUser);
        System.out.println(originalUser == shallowUser);
        System.out.println(originalUser.getAddress() == shallowUser.getAddress());
        System.out.println(originalUser.getFriends() == shallowUser.getFriends());


    }
}
