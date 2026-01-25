package org.example.HomeWork1_5;

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
    }

    public static void Task_2() {
    /*  Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White). При выводе результат работы программы должен быть*/
        System.out.println("\nВторая задача");
        int sizeMassive = 8;
        String[][] matrix = new String[sizeMassive][sizeMassive];

        for (int i = 0; i < sizeMassive; i++) {
            matrix[i][0] = (i % 2 == 0) ? "■" : "□";
        }

        for (int i = 0; i < sizeMassive; i++) {
            for (int j = 1; j < sizeMassive; j++) {
                if (matrix[i][j - 1].equals("■")) {
                    matrix[i][j] = "□";
                } else {
                    matrix[i][j] = "■";
                }
            }
        }

        for (int i = 0; i < sizeMassive; i++) {
            for (int j = 0; j < sizeMassive; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void Task_3() {
        /* Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        Формат входных данных: Программа получает на вход два числа n и m.
        Формат выходных данных: Программа должна вывести полученный массив, отводя на вывод каждого числаровно 3
        символа. */
        System.out.println("\nТретья задача");
        Scanner sc = new Scanner(System.in);
        int n, m, count = 0;
        while (true) {
            System.out.println("Дай количество строк n, сюда, в консоль:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                System.out.println("Ну ты серьезно? Отрицательные!?");
            } else {
                System.out.println("Опять за старое?");
                sc.next();
            }
        }

        while (true) {
            System.out.println("Дай количество столбцов m, сюда, в консоль:");
            if (sc.hasNextInt()) {
                m = sc.nextInt();
                if (m > 0) break;
                System.out.println("Ну ты серьезно? Отрицательные!?");
            } else {
                System.out.println("Опять за старое?");
                sc.next();
            }
        }

        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = count;
                    count++;
                }
                System.out.println();
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    A[i][j] = count;
                    count++;
                }
            }
        }
        System.out.println("Массив змейкой:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        sc.close();
     }

    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
        System.out.print("\n\nВсем спасибо! ");
    }
}
