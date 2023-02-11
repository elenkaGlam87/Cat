package simplejava.Cw3;

import java.util.Scanner;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры число. Необходимо проверить его на четность и нечетность. Если число
 * четное требуется вывести на экран число и надпись «Even number». Если число нечетное выведите на экран число
 * и надпись «Odd number».
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner chis = new Scanner(System.in);
        System.out.println("Введите число");
        int x = chis.nextInt();
        if (x % 2 == 0) System.out.println(x + " Even number");
        else System.out.println(x + " Odd number");
        chis.close();

    }
}
