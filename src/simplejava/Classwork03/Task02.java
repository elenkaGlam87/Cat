package simplejava.Classwork03;

import java.util.Scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 * на экран сумму трёх чисел или произведение трёх чисел.
 */

public class Task02 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = q.nextInt();
        System.out.println("Введите второе число");
        int num_2 = q.nextInt();
        System.out.println("Введите третье число");
        int num_3 = q.nextInt();
        System.out.println("Введите действие");
        String action = q.next();
        q.close();
        actionNumber(num_1, num_2, num_3, action);
    }

    public static void actionNumber(int num_1, int num_2, int num_3, String action) {
        if (action.equals("+")) {
            System.out.println("Сумма чисел равна: " + (num_1 + num_2 + num_3));
        } else if (action.equals("*")) {
            System.out.println("Произведение чисел равно: " + (num_1 * num_2 * num_3));
        } else System.out.println("Неверное действие");
    }
}
