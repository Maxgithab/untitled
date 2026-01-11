package org.example.HomeWork6.Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка первой части задания:");
        Bankomat test1 = new Bankomat(10, 10, 10);
        System.out.println("Денег до добавления:");
        test1.dispay();
        test1.addMoney(5, 2, 10);
        System.out.println("\nДенег после добавления:");
        test1.dispay();

        System.out.println("\nПроверка второй части задания:");
        Bankomat test2 = new Bankomat(2, 10, 10);
        System.out.println("Денег до снятия:");
        test2.dispay();

        int wannaMoney = 90;
        if (test2.needCash(wannaMoney)) {
            System.out.println("Деньги выданы");
        } else {
            System.out.println("Денег не дали");
        }

        System.out.println("\nДенег после снятия:");
        test2.dispay();

    }

}
