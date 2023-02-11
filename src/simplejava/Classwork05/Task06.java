package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 5
 * Пользователь вводит с клавиатуры длину линии.
 * Нужно отобразить на экране горизонтальную линию из *, указанной длины.
 * Например, если было введено 7, тогда вывод на экран будет такой: *******
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Введите длину линии");
        int a = w.nextInt();
        w.close();
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }

    }
}
