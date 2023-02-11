package simplejava.Cw2;

import java.util.Scanner;

/**
 * Задание 4
 * Напишите программу, вычисляющую площадь треугольника. Пользователь с клавиатуры вводит размер
 * основания треугольника и размер высоты.
 * S=½bh
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер основания треугольника");
        double b = in.nextDouble();
        System.out.println("Введите размер высоты треугольника");
        double h = in.nextDouble();
        double s = (b / 2) * h;
        in.close();
        System.out.println("Площадь треугольника равна " + s);

    }
}
