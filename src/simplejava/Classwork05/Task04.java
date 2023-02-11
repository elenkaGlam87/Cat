package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры два числа. Нужно посчитать сумму чисел в указанном диапазоне, а также
 * среднеарифметическое
 */

public class Task04 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x1 = t.nextInt();
        System.out.println("Введите второе число");
        int x2 = t.nextInt();
        t.close();
        int b = 0;
        int c = 0;
        int count = 0;
        for (int i = x1; i <= x2; i++) {
            count++;
            b += i;
            c = b / count;
        }
        System.out.println(b);
        System.out.println(c);
    }
}
