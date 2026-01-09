package org.example;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {

    public static void Task_1() {
      /*1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/
        System.out.println("Первая задача");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int sizeMassive = 5;
        int[][] matrix = new int[sizeMassive][sizeMassive];
        System.out.println("Двумерный массив:");
        for (int i = 0; i < sizeMassive; i++) {
            for (int j = 0; j < sizeMassive; j++) {
                matrix[i][j] = random.nextInt(149) - 50;
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Дай целое число, сюда, в консоль:");
            String input = sc.next();
            try {
                int t = Integer.parseInt(input);
                System.out.println("Массив после сложения:");
                for (int i = 0; i < sizeMassive; i++) {
                    for (int j = 0; j < sizeMassive; j++) {
                        matrix[i][j] = matrix[i][j] + t;
                        System.out.printf("%5d", matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ты что, дурачок?.. Просил дать целое число! Еще раз:");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Task_1();

    }
}
