package simplejava.Classwork02;

import java.util.Scanner;

/**
 * Задание 5
 * Пользователь с клавиатуры вводит четырёхзначное число. Необходимо перевернуть число и отобразить результат.
 * Например, если введено 4512, результат 2154.
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner chis = new Scanner(System.in);
        System.out.println("Введите число");
        int num = chis.nextInt();
        chis.close();
        int result = newNumber(num);
        System.out.println(result);
    }

    public static int newNumber(int num) {
        int num_1 = num % 10;
        int num_2 = (num / 10) % 10;
        int num_3 = (num / 100) % 10;
        int num_4 = (num / 1000) % 10;
        int num_new = (num_1 * 1000) + (num_2 * 100) + (num_3 * 10) + num_4;
        return num_new;
    }
}
