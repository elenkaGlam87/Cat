package simplejava.Classwork01;

import java.util.Scanner;

/**
 * Задание 5
 * Напишите программу, вычисляющую площадь квадрата. Пользователь с клавиатуры вводит размер стороны
 * квадрата
 */

public class Task05 {
    public static void main(String[] args) {
        int result = countSquare();
        System.out.println("Площадь квадрата равна " + result);
    }

    public static int countSquare() {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата");
        int a = q.nextInt();
        int b = (int) Math.pow(a, 2);
        return b;
    }
}
