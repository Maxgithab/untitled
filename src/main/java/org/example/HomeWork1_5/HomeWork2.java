package org.example.HomeWork1_5;

import java.util.Scanner;

public class HomeWork2 {
    public static void Task_1() {
        /*Задача 1:
        Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2'). */
        System.out.println("Первая задача");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Дай целое число, сюда, в консоль:");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " - Четное число");
                } else {
                    System.out.println(number + " - Нечетное число");
                }
                break;
            } else {
                System.out.println("Ты что, дурачок?.. Просил же дать число! Еще раз:");
                sc.next();
            }
        }
    }

    public static void Task_2() {
        /*Задача 2:
        Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
        Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/
        System.out.println("\nВторая задача");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Дай температуру в цельсиях, что сейчас на улице, сюда, в консоль:");
            String input = sc.next();
            try {
                String changed = input.replace(',', '.');
                double t = Double.parseDouble(changed);

                if (t < -273.15) {
                    System.out.println("Иди учи физику! Давай реальную температуру, по новой");
                    continue;
                } else if (t > 100) {
                    System.out.println("Ты на Венере что ли? Давай нормальные числа, по новой...");
                    continue;
                }

                int category = 0;
                if (t > -5) {
                    category = 1;
                }//warm
                if (t > -20 && t <= -5) {
                    category = 2;
                } //norm
                if (t <= -20) {
                    category = 3;
                }//cold
                switch (category) {
                    case 1 -> System.out.println("Warm");
                    case 2 -> System.out.println("Normal");
                    case 3 -> System.out.println("Cold");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ты что, дурачок?.. Просил же дать температуру! Еще раз:");
            }
        }
        sc.close();
    }

    public static void Task_3() {
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        System.out.println("\nТретья задача");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + "\u00B2 = " + i * i);
        }
    }

    public static void Task_4() {
    /*  Задача 4:
        Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
        System.out.println("\nЧетвертая задача");
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i = i + 7;
        }
    }

    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
        Task_4();
        System.out.println("\n\nВсем спасибо!");
    }
}
