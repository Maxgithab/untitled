package org.example;
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
        System.out.println("\n\nВторая задача");
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
        System.out.println("Четвертая задача");
        Random random = new Random();
        int sizeMassive = 100;
        int[] array = new int[sizeMassive];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        System.out.println("Массив: ");
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

    public static void main(String[] args) {
     //   Task_1();
      //  Task_2_and_3();
        Task_4();
    }
}
