package simplejava.Classwork02;

import java.util.Scanner;

/**
 * Задание 4
 * Напишите программу, вычисляющую площадь треугольника. Пользователь с клавиатуры вводит размер
 * основания треугольника и размер высоты.
 * S=½bh h-высота, b-основание
 */

public class Task04 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Введите размер основания треугольника");
        double b = y.nextDouble();
        System.out.println("Введите размер высоты треугольника");
        double h = y.nextDouble();
        y.close();
        double result = squareTriangle(b,h);
        System.out.println("Площадь треугольника равна: " + result);
    }

    public static double squareTriangle(double b, double h) {
        double s = 0.5 * b * h;
        return s;
    }
}
