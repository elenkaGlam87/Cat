package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне.
 * Если границы диапазона указаны неправильно требуется произвести нормализацию границ. Например,
 * пользователь ввел 20 и 11, требуется нормализация после которой начало диапазона станет равно 11, а конец 20.
 */

public class Task03 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x1 = x.nextInt();
        System.out.println("Введите второе число");
        int x2 = x.nextInt();
        if (x1 < x2) {
            for (int i = x1; i < x2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = x2; i < x1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}




