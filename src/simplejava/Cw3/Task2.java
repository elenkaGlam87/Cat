package simplejava.Cw3;

import java.util.Scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 * на экран сумму трёх чисел или произведение трёх чисел.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int one = in.nextInt();
        System.out.println("Введите второе число");
        int two = in.nextInt();
        System.out.println("Введите третье число");
        int three = in.nextInt();
        System.out.println("Введите действие");
        String action = in.next();
        in.close();
        if (action.equals("+")) {
            System.out.println(one + two + three);
        } else if (action.equals("*")) {
            System.out.println(one * two * three);
        } else {
            System.out.println("Неверное действие");
        }

    }
}


