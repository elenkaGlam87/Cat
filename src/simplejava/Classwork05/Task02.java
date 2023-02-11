package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры два числа. Нужно показать все четные числа в указанном диапазоне
 */

public class Task02 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = z.nextInt();
        System.out.println("Введите второе число");
        int num_2 = z.nextInt();
        z.close();
        for (int i = num_1; i < num_2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
