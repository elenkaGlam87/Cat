package simplejava.Classwork06;

import java.util.Scanner;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры размер стороны квадрата. Требуется отобразить на экран заполненный
 * квадрат. Размер стороны равен введённому размеру. Например, если пользователь ввёл 3 на экране будет выведено:
 * ***
 * ***
 * ***
 */

public class Task01 {
    public static void main(String[] args) {
        int side = inputSideSquare();
        fillInSquare(side);
    }

    public static int inputSideSquare() {

        Scanner r = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата");
        int x = r.nextInt();
        return x;
    }

    public static void fillInSquare(int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
