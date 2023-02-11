package myhomework.base;

import javax.swing.*;

/**
 * Урок 7. Условный оператор.
 * <p>
 * Используя JOptionPane, попросите пользователя ввести первое положительное число.
 * Если пользователь не ввёл ничего, то напишите ему об этом, используя JOptionPane.
 * Используя JOptionPane, попросите пользователя ввести второе число, отличное от 0.
 * Если пользователь не ввёл ничего, то напишите ему об этом, используя JOptionPane.
 * Если пользователь ввёл 0, то выведите в JOptionPane сообщение: «Результат: бесконечность».
 * Если пользователь ввёл не 0, то выведите через JOptionPane результат деления первого числа на второе.
 * Примечание: Если пользователь ввёл некорректные данные (ничего не ввёл, либо какую-нибудь строку вместо числа),
 * то завершайте программу.
 */

public class Lesson7 {
    public static void main(String[] args) {
        String number1;
        number1 = JOptionPane.showInputDialog("Введите первое положительное число");
        int newNumber1 = Integer.parseInt(number1);

        if (number1.isBlank()) {
            JOptionPane.showMessageDialog(null, "Вы не ввели первое число");
        } else {
            JOptionPane.showMessageDialog(null, "Ваше первое число " + number1);
        }
        String number2;
        number2 = JOptionPane.showInputDialog("Введите второе положительное число");
        int newNumber2 = Integer.parseInt(number2);

        if (number2.isBlank()) {
            JOptionPane.showMessageDialog(null, "Вы не ввели второе число");
        } else {
            if (newNumber2 != 0) {
                JOptionPane.showMessageDialog(null, "Ваше второе число " + number2);
                JOptionPane.showMessageDialog(null, "Результат деления первого числа на второе: "
                        + (newNumber1 / newNumber2));
            } else if (newNumber2 == 0) {
                JOptionPane.showMessageDialog(null, "Результат: бесконечность");
            }
        }
    }
}
