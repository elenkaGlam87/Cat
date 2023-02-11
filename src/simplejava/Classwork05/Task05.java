package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры число. Требуется посчитать факториал числа. Например, если введено 3,
 * факториал числа 1*2*3 = 6.
 * Формула для расчета факториала: n! = 1*2*3…*n, где
 * n — число для расчета факториала
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите число");
        int num = q.nextInt();
        q.close();
        int z = 1;
        for (int i = 1; i <= num; i++) {
            z *= i;
        }
        System.out.println(z);
    }
}
