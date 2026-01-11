package org.example.HomeWork6.Task1;

/*Напишите программу, которая создает три объекта класса CreditCard, заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек*/

public class MainTest {
    public static void main(String[] args) {


        CreditCard account1 = new CreditCard("BRTB6TG", 2500);
        CreditCard account2 = new CreditCard("YUYM8IK", 2000);
        CreditCard account3 = new CreditCard("INFA2OL", 3000);

        account1.deposit(200);
        account2.deposit(311);
        account3.cashOut(90);

        account1.display();
        account2.display();
        account3.display();

    }
}
