package simplejava.Cw1;

import java.util.Scanner;

/**
 * Задание 5
 * Напишите программу, вычисляющую площадь квадрата. Пользователь с клавиатуры вводит размер стороны
 * квадрата.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата");
        double a= in.nextDouble();
        in.close();
        double s=Math.pow(a,2);
        System.out.printf(String.format("Площадь квадрата равна %.2f", s));
    }
}
