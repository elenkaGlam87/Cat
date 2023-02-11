package simplejava.Classwork06;

import java.util.Scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры размер стороны квадрата. Требуется отобразить на экран незаполненный
 * квадрат (отображаются только границы квадрата). Размер стороны равен введённому размеру.
 */

public class Task02 {
    public static void main(String[] args) {
        int side = inputSideSquare();

    }

    public static int inputSideSquare () {
        Scanner t = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата");
        int a = t.nextInt();
        return a;
    }

    public static void fillInSquare (int a) {


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == (a - 1)) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}