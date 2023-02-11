package myhomework.base;

import javax.swing.*;
import java.util.Scanner;

/**
 * Урок 8. Оператор цикла for
 *  Попросите пользователя ввести положительное целое число через JOptionPane.
 *  Обработайте некорректные данные (ничего не ввёл, отрицательное число, 0, не
 * целое число), выведя соответствующие уведомления об ошибке.
 *  Вычислите сумму всех чисел от 1 до числа, введённого пользователем, используя
 * цикл for.
 *  Выведите результат пользователю через JOptionPane.
 * Пример: Пользователь ввёл 7, значит, надо вычислить сумму: 1+2+3+4+5+6+7=?
 */

public class Lesson8 {
    public static void main(String[] args) {
        String inputNumber;
        inputNumber = JOptionPane.showInputDialog(null, "Введите положительное целое число");
        if (inputNumber != null && !inputNumber.equals(" ")) {
            int number = Integer.parseInt(inputNumber);
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Ошибка ввода!");
            } else {
                JOptionPane.showMessageDialog(null, "Ваше число " + number);
                int result = 0;
                for (int i = 0; i <= number; i++) {
                    result += i;
                }
                JOptionPane.showMessageDialog(null, "Сумма равна " + result);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ошибка ввода!");
        }
    }
}
