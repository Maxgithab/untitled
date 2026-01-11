package org.example.HomeWork6.Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка первой части задания:");
        Bankomat test1 = new Bankomat(10, 10, 10);
        System.out.println("Денег до добавления:");
        test1.dispay();
        test1.addMoney(5,2,10);
        System.out.println("\nДенег после добавления:");
        test1.dispay();

        System.out.println("\nПроверка второй части задания:");
        Bankomat test2 = new Bankomat(10, 10, 10);
        System.out.println("Денег до снятия:");
        test2.dispay();
        test2.needCash(510);
        System.out.println("\nДенег после снятия:");
        test2.dispay();
    }

}
