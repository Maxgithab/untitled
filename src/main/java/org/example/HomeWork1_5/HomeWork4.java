package org.example.HomeWork1_5;

import java.util.Random;

public class HomeWork4 {
    public static void Task_1() {
        // Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        System.out.println("Первая задача");
        int[] mass = {10, 20, 30, 40, 50};
        System.out.print("Прямой порядок: ");
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.print("\nОбратный порядок: ");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }

    public static void Task_2_and_3() {
        /*Задача 2: Найти минимальный-максимальный элементы и вывести в консоль.
          Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.*/
        System.out.println("\n\nВторая-Третья задача");
        int[] mass = {5, -3, 17, 0, 42, -10, 8};
        int min = mass[0];
        int max = min;
        int minInd = 0;
        int maxInd = minInd;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
                minInd = i;
            }
            if (mass[i] > max) {
                max = mass[i];
                maxInd = i;
            }
        }
        System.out.println("Минимальный элемент: " + min + " Индекс: " + minInd);
        System.out.println("Максимальный элемент: " + max + " Индекс: " + maxInd);
    }

    public static void Task_4() {
    /* Найти и вывести количество нулевых элементов.
       Если нулевых элементов нет - вывести сообщение, что их нет. */
        System.out.println("\nЧетвертая задача");
        Random random = new Random();
        int sizeMassive = 50;
        int[] array = new int[sizeMassive];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        int zero = 0;
        for (int num : array) {
            if (num == 0) {
                zero = zero + 1;
            }
        }
        if (zero == 0) {
            System.out.println("\nВ массиве нулевых нетъ");
        } else {
            System.out.println("\nКоличество нулевых элементов: " + zero);
        }
    }

    public static void Task_5() {
        /*Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д*/
        System.out.print("\nПятая задача");
        int[] mass = {10, 20, 30, 40, 50, 60, 70};
        System.out.print("\nМассив до преобразований: ");
        for (int num : mass) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < mass.length / 2; i++) {
            int j = mass.length - 1 - i;
            int temp = mass[i];
            mass[i] = mass[j];
            mass[j] = temp;
        }
        System.out.print("\nМассив после преобразований: ");
        for (int num : mass) {
            System.out.print(num + " ");
        }
    }

    public static void Task_6() {
    /*Проверить, является ли массив возрастающей последовательностью (каждое следующее
      число больше предыдущего).*/
        System.out.println("\n\nШестая задача");
        int[] mass = {10, 20, 30, 40, 50, 60, 70};
        //int[] mass = {10, 20, 300, 40, 50, 60, 70};
        //int[] mass = {10, 20, 30, 40, 40, 60, 70 };
        boolean isIncreasing = true;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] >= mass[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность НЕ возрастающая");
        }
    }

    public static void Task_7() {
/*Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3] Output: [1,4,0,5,6,4]
Input: [9,9,9] Output: [1,0,0,0] */
        System.out.println("\nСедьмая задача, со *");
        int[] mass = {1, 9, 9};
        //int[] mass = {9, 9, 9};
        //int[] mass = {1, 2, 3};
        int plusOne = 1;
        System.out.print("Массив до преобразований: ");
        for (int num : mass) {
            System.out.print(num + " ");
        }
        for (int i = mass.length - 1; i >= 0; i--) {
            if ((mass[i] + plusOne) == 10) {
                mass[i] = 0;
                plusOne = 1;
            } else {
                mass[i] = mass[i] + plusOne;
                plusOne = 0;
            }
        }
        System.out.print("\nМассив после преобразований: ");
        if (plusOne == 0) {
            for (int num : mass) {
                System.out.print(num + " ");
            }
        } else {
            int[] newMass = new int[mass.length + 1];
            newMass[0] = 1;
            for (int num : newMass) {
                System.out.print(num + " ");
            }
        }
    }


    public static void main(String[] args) {
        Task_1();
        Task_2_and_3();
        Task_4();
        Task_5();
        Task_6();
        Task_7();
        System.out.print("\n\nВсем спасибо! ");
    }
}
