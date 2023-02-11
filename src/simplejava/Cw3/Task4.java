package simplejava.Cw3;

import java.util.Scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
 * переводит метры в мили, дюймы или ярды.
 * 1 м = 0,00062 мили;
 * 1 м = 39,37 дюймов;
 * 1 м = 1,09 ярдов.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner metr = new Scanner(System.in);
        System.out.println("Введите количество метров");
        double x = metr.nextDouble();
        System.out.println("Введите действие");
        String action = metr.next();
        metr.close();
        switch (action) {
            case "Mile":
                System.out.println((x * 0.00062) + " мили");
                break;
            case "Duim":
                System.out.println((x * 39.37) + " дюймов");
                break;
            case "Jard":
                System.out.println((x * 1.09) + " ярдов");
                break;
            default:
                System.out.println("Неверное действие");

        }

    }
}
