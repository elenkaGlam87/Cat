package myhomework.base;

import javax.swing.*;

/**
 * Урок 11. Оператор switch-case
 *  Попросите пользователя ввести первое число через JOptionPane, а затем аналогично второе.
 *  Попросите пользователя ввести одну из операций: «+», «-», «*», «/».
 *  Используя switch-case выполните соответствующую операцию между двумя введёнными числами
 * и выведите результат через JOptionPane.
 * Примечание: При вводе некорректных данных выведите информацию об ошибке в консоль и завершите программу.
 */

public class Lesson11 {
    public static void main(String[] args) {
        String inputNumber1;
        String inputNumber2;
        String inputAction;
        inputNumber1 = JOptionPane.showInputDialog(null, "Введите первое число");
        inputNumber2 = JOptionPane.showInputDialog(null, "Введите второе число");
        inputAction = JOptionPane.showInputDialog(null, "Введите операцию");
        if (inputNumber1.isBlank() || inputNumber2.isBlank() || inputAction.isBlank()) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных!");
        } else {
            int number1 = Integer.parseInt(inputNumber1);
            int number2 = Integer.parseInt(inputNumber2);
            switch (inputAction) {
                case ("+"):
                    JOptionPane.showMessageDialog(null, "Сумма чисел равна: "
                            + (number1 + number2));
                    break;
                case ("-"):
                    JOptionPane.showMessageDialog(null, "Разность чисел равна: "
                            + (number1 - number2));
                    break;
                case ("*"):
                    JOptionPane.showMessageDialog(null, "Произведение чисел равно: "
                            + number1 * number2);
                    break;
                case ("/"):
                    JOptionPane.showMessageDialog(null, "Деление чисел равно: "
                            + (number1 / number2));
                    break;
            }
        }
    }
}
