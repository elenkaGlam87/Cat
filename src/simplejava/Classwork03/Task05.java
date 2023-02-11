package simplejava.Classwork03;

import java.util.Scanner;

/**
 * Задание 5
 * Пользователь с клавиатуры вводит количество часов.
 * Если полученное значение находится в диапазоне от 0 до 6 нужно вывести надпись «Good Night»,
 * если в диапазоне от 6 до 13 «Good Morning», если в диапазоне от 13 до 17 «Good Day»,
 * если в диапазоне от 17 до 0 «Good Evening».
 * Верхняя граница диапазона не включается. Например, число 6 относится к 6 до 13
 */

public class Task05 {
    public static void main(String[] args) {
        int hour = inputHour();
        timeDay(hour);
    }

    public static int inputHour () {
        Scanner z = new Scanner(System.in);
        System.out.println("Введите количество часов");
        int hour = z.nextInt();
        z.close();
        return hour;
    }

    public static void timeDay(int hour) {

        if (hour >= 0 && hour < 6 || hour == 24) {
            System.out.println("Good Night");
        } else if (hour >= 6 && hour < 13) {
            System.out.println("Good Morning");
        } else if (hour >= 13 && hour < 17) {
            System.out.println("Good Day");

        } else if (hour >= 17 && hour < 24) {
            System.out.println("Good Evening");
        } else System.out.println("Неверное число");
    }
}
