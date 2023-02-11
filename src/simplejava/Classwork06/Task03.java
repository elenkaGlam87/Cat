package simplejava.Classwork06;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры длину и ширину прямоугольника. Требуется отобразить на экран
 * незаполненный прямоугольник (отображаются только границы прямоугольника).
 * Размер длины и ширины равен введенным данным
 */

public class Task03 {
    static int length;
    static int width;

    public static void main(String[] args) {
        fillRectangle();
    }

    public static void inputRectangle() {
        Scanner w = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        width = w.nextInt();
        System.out.println("Введите длину прямоугольника");
        length = w.nextInt();
    }

    public static void fillRectangle() {
        inputRectangle();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (length - 1) || j == 0 || j == (width - 1)) {
                    System.out.print(" *");
                } else System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
