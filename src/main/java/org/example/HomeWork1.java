package org.example;

public class HomeWork1 {
    public static void Task_1() {
        // Задача 1
        // написать приложение, которое будет вычислять и выводить значение по формуле:
        // a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
        double b = 25.6;
        double c = 20.55;
        double a = 4 * (b + c - 1) / 2;
        System.out.println("Задача 1");
        System.out.println("Результат вычислений а = " + a);
        System.out.println();
    }

    public static void Task_2() {
        //  Задача 2:
        //  В переменной n хранится двузначное число. Создайте программу, вычисляющую и
        //  выводящую на экран сумму цифр n. Например: n = 26, в результате мы должны получить 8 (2+6).
        byte n = 82;
        int n_tens = n / 10;
        int n_ones = n % 10;
        System.out.println("Задача 2");
        System.out.println("Сумма цифр n_2 = " + (n_tens + n_ones));
        System.out.println();
    }

    public static void Task_3() {
        //  Задача 3:
        //  В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        //  выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).
        int n = 567;
        int n_hundreds = n / 100;
        int n_tens = (n % 100) / 10;
        int n_ones = n % 10;
        System.out.println("Задача 3");
        System.out.println("Сумма цифр n_3 = " + (n_hundreds + n_tens + n_ones));
        System.out.println();
    }

    public static void Task_4() {
        //  Задача 4:
        //  В переменной n_4 хранится вещественное число с ненулевой дробной частью. Создайте
        //  программу, округляющую число n до ближайшего целого и выводящую результат на экран.
        double n = 567.5;
        long n_rounded = Math.round(n);
        System.out.println("Задача 4");
        System.out.println("Округление числа n_4 = " + n_rounded);
        System.out.println();
    }

    public static void Task_5() {
        //  Задача 5:
        //  В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
        //  на экран результат деления q на w с остатком. Пример вывода программы (для случая,
        //  когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
        int q = 150;
        int w = 4;
        int x = q / w;
        int y = q % w;
        System.out.println("Задача 5");
        System.out.println(q + " / " + w + " = " + x + " и " + y + " в остатке");
        System.out.println();
    }

    public static void Task_6_1() {
        //  Задача *:
        //  Написать программу, которая будет менять местами значение целочисленных переменных. Пример:
        //  int a = 1; int b = 2;
        //  код (ваше решение)
        //  sout(a); выведет 2
        //  sout(b); выведет 1
        int a = 20;
        int b = 1;
        //Решение
        int c = a;
        a = b;
        b = c;
        System.out.println("Задача 6_1");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    public static void Task_6_2() {
        //  Задача *:
        //  Написать программу, которая будет менять местами значение целочисленных переменных. Пример:
        //  int a = 1; int b = 2;
        //  код (ваше решение)
        //  sout(a); //выведет 2
        //  sout(b); //выведет 1
        //  Усовершенствовать программу, использовать только 2 входные переменные (a,b);
        int a = -20;
        int b = 5;
        //Решение
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Задача 6_2");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
        Task_4();
        Task_5();
        Task_6_1();
        Task_6_2();
    }
}