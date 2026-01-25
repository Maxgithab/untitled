package org.example.HomeWork1_5;

public class HomeWork3 {
    public static void main(String[] args) {
        /*Создать новый проект, запушить его на удалённый репозиторий GitHub. Сделать
        несколько коммитов в мастер ветке. Создать отдельную ветку, переключиться на неё и
        сделать несколько коммитов. Смержить в мастер ветку. Все последующие решения
        Домашних заданий присылать в GitHub(ссылка на репозиторий).*/

        System.out.println("Hello Git!");
    }

    // Calculator.java
    public class Calculator {
        public static int sum(int a, int b) {
            return a + b;
        }

    }
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello Git!");
            System.out.println("Sum: " + Calculator.sum(5, 3));
            System.out.println("Понятно бы чего стало...");
        }
    }

}