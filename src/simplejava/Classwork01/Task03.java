package simplejava.Classwork01;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел, разницу чисел, произведение
 * чисел. Результат вычислений вывести на экран.
 */

public class Task03 {
    public static void main(String[] args) {
        Scanner chisl = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = chisl.nextInt();
        System.out.println("Введите второе число");
        int num_2 = chisl.nextInt();
        chisl.close();
        countSum(num_1, num_2);
        countRaz(num_1, num_2);
        countPro(num_1, num_2);
    }

    public static void countSum(int num_1, int num_2) {
        int sum = num_1 + num_2;
        System.out.println(sum);
    }

    public static void countRaz(int num_1, int num_2) {
        int raz = num_1 - num_2;
        System.out.println(raz);
    }

    public static void countPro(int num_1, int num_2) {
        int pro = num_1 * num_2;
        System.out.println(pro);
    }
}
