package org.example.HomeWork6.Task2;

/*Задача *:
    Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая
принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции. При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаёт вся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала.*/

public class Bankomat {
    int banknote20;
    int banknote50;
    int banknote100;

    Bankomat(int curr20, int curr50, int curr100) {
        banknote20 = curr20;
        banknote50 = curr50;
        banknote100 = curr100;
    }

    void addMoney(int s20, int s50, int s100) {
        banknote20 += s20;
        banknote50 += s50;
        banknote100 += s100;
    }

    void dispay() {
        System.out.println("В банкомате:");
        System.out.println(banknote20 + " шт. по 20 деняк");
        System.out.println(banknote50 + " шт. по 50 деняк");
        System.out.println(banknote100 + " шт. по 100 деняк");
        System.out.println("Итого деняк: " + allMoney());
    }

    int allMoney() {
        return banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }

    boolean needCash(int cashAmount) {
        if ((cashAmount % 10 != 0) || (cashAmount < 20) || (cashAmount > allMoney())) {
            System.out.println("Ошибка: нужна другая сумма((");
            return false;
        }

        for (int take100Amount = Math.min(cashAmount / 100, banknote100); take100Amount >= 0; take100Amount--) {
            int restCashAfter100 = cashAmount - take100Amount * 100;
            for (int take50Amount = Math.min(restCashAfter100 / 50, banknote50); take50Amount >= 0; take50Amount--) {
                int restCashAfter50 = restCashAfter100 - take50Amount * 50;

                if (restCashAfter50 % 20 == 0) {
                    int take20Amount = restCashAfter50 / 20;
                    if (take20Amount <= banknote20) {
                        System.out.println("Выдано деняк:");
                        if (take20Amount > 0) System.out.println("20: " + take20Amount + " шт.");
                        if (take50Amount > 0) System.out.println("50: " + take50Amount + " шт.");
                        if (take100Amount > 0) System.out.println("100: " + take100Amount + " шт.");

                        banknote100 -= take100Amount;
                        banknote50 -= take50Amount;
                        banknote20 -= take20Amount;

                        return true;
                    }
                }
            }
        }
        System.out.println("Не вариант, " + cashAmount + " не выдам тем что есть, сорян");
        return false;
    }
}