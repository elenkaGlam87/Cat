package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры два числа. Нужно показать все числа в указанном диапазоне
 */

public class Task01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a1 = a.nextInt();
        System.out.println("Введите второе число");
        int a2 = a.nextInt();
        for (int x = a1; x < a2; x++) {
            System.out.println(x);
        }

    }
}
