package myfirstobject.calculator;

import java.util.Scanner;

/**
 * Необходимо написать простой консольный калькулятор на Java. ‚ делать через статические методы.
 * <p>
 * метод int getInt() - должен считывать с консоли целое число и возвращать его
 * метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ
 * с операцией (+, -, * или /)
 * метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую
 * операцию, заданную operation.
 * метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(),
 * передать все методу calc() и вывести на экран результат.
 * Решить проблему связанную с делением на 0.
 */

public class Calculator {

    static Scanner num = new Scanner(System.in);

    public static int getInt() {

        System.out.println("Введите число");
        return num.nextInt();
    }

    public static char getOperation() {
        System.out.println("Введите операцию");
        return num.next().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        if (operation == '+') {
            return num1 + num2;
        } else if (operation == '-') {
            return num1 - num2;
        } else if (operation == '*') {
            return num1 * num2;
        } else if (operation == '/' && num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("деление на 0 запрещено");
            return 0;
        }
    }
}
