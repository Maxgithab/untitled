package org.example.HomeWork6.Task1;

/*Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.*/

public class CreditCard {
    String cardNumber;
    double cardAmount;

    CreditCard(String num, double balance) {
        cardNumber = num;
        cardAmount = balance;
    }

    void deposit(double depositPlus) {
        cardAmount += depositPlus;
    }

    void cashOut(double someCashOut) {
        cardAmount -= someCashOut;
    }
    void display() {
        System.out.println("На счёте " + cardNumber + " остаток средств " + cardAmount);
            }
}