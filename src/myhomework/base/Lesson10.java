package myhomework.base;

import javax.swing.*;

/**
 * Урок 10. Оператор цикла do-while
 *  Используя бесконечный цикл do-while, заставьте пользователя ввести положительное целое число.
 * Примечание: Если пользователь вводит что-то некорректное, то сообщайте ему об этом и просите снова ввести
 * положительное целое число. И так до бесконечности, пока он не введёт правильный вариант.
 * Как только он вводит правильный вариант, выходите из цикла, и выводите JOptionPane с сообщением: «Спасибо!»
 */

public class Lesson10 {
    public static void main(String[] args) {
        String inputNumber;
        int number;
        do {
            inputNumber = JOptionPane.showInputDialog(null, "Введите положительное целое число");
            number = Integer.parseInt(inputNumber);
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Введено некорректное число");
            }
        } while (number <= 0);
        JOptionPane.showMessageDialog(null, "Спасибо!");
    }
}
