package simplejava.Cw2;

import java.util.Scanner;

/**
 * Задание 5
 * Пользователь с клавиатуры вводит четырёхзначное
 * число. Необходимо перевернуть число и отобразить
 * результат. Например, если введено 4512, результат 2154
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        int x = ch.nextInt();
        int a1 = x % 10;
        int a2 = (x / 10) % 10;
        int a3 = (x / 100) % 10;
        int a4 = (x / 1000) % 10;
        int xn = (a1 * 1000) + (a2 * 100) + (a3 * 10) + a4;
        System.out.println(xn);
        ch.close();
    }
}
