package org.example.HomeWork10;

/*Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.*/

public class Main {
    public static void main(String[] args) {
        User user1 = new User("1", "NameName", "e-mail@email.com");
        User user2 = new User("1", "NameName", "e-mail@email.com");
        User user3 = new User("2", "NameSurname", "empty@empty.net");
        User user4 = user1;

        System.out.println("Печать с toSring");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);

        System.out.println("\nПроверка Хэш-кода");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());

        System.out.println("\nПроверка equals");
        System.out.println("   Первый юзер");
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.equals(user4));
        System.out.println("   Второй юзер");
        System.out.println(user2.equals(user3));
        System.out.println(user2.equals(user4));
        System.out.println("   Третий юзер");
        System.out.println(user3.equals(user4));

        System.out.println("\nСравнение ссылок");
        System.out.println("   Первый юзер");
        System.out.println(user1 == user2);
        System.out.println(user1 == user3);
        System.out.println(user1 == user4);
        System.out.println("   Второй юзер");
        System.out.println(user2 == user3);
        System.out.println(user2 == user4);
        System.out.println("   Третий юзер");
        System.out.println(user3 == user4);
    }
}
