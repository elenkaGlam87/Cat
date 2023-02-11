package simplejava.Classwork03;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 * на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.
 */

public class Task03 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введение первое число");
        double a1 = x.nextDouble();
        System.out.println("Введение второе число");
        double a2 = x.nextDouble();
        System.out.println("Введение третье число");
        double a3 = x.nextDouble();
        System.out.println("Выберите действие");
        String action = x.next();
        x.close();
        actionNumber(a1, a2, a3, action);
    }

    public static void actionNumber(double a1, double a2, double a3, String action) {

        if (action.equals("max")) {
            System.out.println("Максимум из трех чисел: " + (Math.max(a1, (Math.max(a2, a3)))));
        } else if (action.equals("min")) {
            System.out.println("Минимум из трех чисел: " + (Math.min(a1, (Math.min(a2, a3)))));
        } else if (action.equals("sred")) {
            System.out.println("Среднеарифметическое из трех чисел: " + ((a1 + a2 + a3) / 3));
        } else System.out.println("Неверное действие");
    }
}
