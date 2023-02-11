package simplejava.Classwork03;

import java.util.Scanner;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры число. Необходимо проверить его на четность
 * и нечетность.
 * Если число четное требуется вывести на экран число и надпись «Even number».
 * Если число нечетное выведите на экран число и надпись «Odd number».
 */

public class Task01 {
    public static void main(String[] args) {
        int value = inputNumber();
        checkNumber(value);
    }

    public static int inputNumber() {

        Scanner x = new Scanner(System.in);
        System.out.println("Введите число");
        int num = x.nextInt();
        x.close();
        return num;
    }

    public static void checkNumber(int num) {

        if ((num % 2) == 0) {
            System.out.println("Even number");
        } else System.out.println("Odd number");
    }
}
