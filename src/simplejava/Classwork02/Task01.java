package simplejava.Classwork02;

import java.util.Scanner;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
 * если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
 */

public class Task01 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = p.nextInt();
        System.out.println("Введите второе число");
        int num_2 = p.nextInt();
        System.out.println("Введите третье число");
        int num_3 = p.nextInt();
        p.close();
        numberNew(num_1, num_2, num_3);
    }

    public static void numberNew(int a, int b, int c) {
        int z = (a * 100) + (b * 10) + c;
        System.out.println(z);
    }
}
