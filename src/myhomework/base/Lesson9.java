package myhomework.base;

import javax.swing.*;

/**
 * Урок 9. Оператор цикла while
 *  Попросите пользователя ввести неотрицательно целое число через JOptionPane.
 *  Обработайте некорректные данные (ничего не ввёл, отрицательное число, не целое
 * число), выведя соответствующие уведомления об ошибке.
 *  Вычислите факториал числа, введённого пользователем, используя цикл while.
 *  Выведите результат пользователю через JOptionPane.
 * Примечание: Факториал 0 = 1, факторил 1 = 1, факториал 2 = 1 * 2, факториал 3 = 1 * 2 *
 * 3, факториал числа n = 1 * 2 * 3 * … * (n – 1) * n.
 */

public class Lesson9 {
    public static void main(String[] args) {
        String inputNumber;
        inputNumber = JOptionPane.showInputDialog(null, "Введите неотрицательное целое число");
        if (inputNumber.isBlank()) {
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
        } else {
            int number = Integer.parseInt(inputNumber);
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, " Вы ввели некорректное число");
            } else {
                JOptionPane.showMessageDialog(null, "Вы ввели число " + number);

                int result = 1;
                if (number == 1) {
                    JOptionPane.showMessageDialog(null, " Факториал числа равен: " + result);
                } else {
                    int n = 1;
                    while (number >= n) {
                        result *= n;
                        n++;
                    }
                    JOptionPane.showMessageDialog(null, "Факториал числа равен: " + result);
                }
            }
        }
    }
}
