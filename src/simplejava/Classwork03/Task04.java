package simplejava.Classwork03;

import java.util.Scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
 * переводит метры в мили, дюймы или ярды.
 * 1 метр = 0,00062 мили
 * 1 метр = 39,37 дюйм
 * 1 метр = 1,09 ярд
 */

public class Task04 {
    static double metr;
    static String choice;

    public static void main(String[] args) {
        equalsNumber();
    }

    public static void inputInf() {

        Scanner w = new Scanner(System.in);
        System.out.println("Введите количество метров");
        metr = w.nextDouble();
        System.out.println("Выберите действие");
        choice = w.next();
        w.close();
    }

    public static void equalsNumber() {
        inputInf();
        if (choice.equals("mil")) {
            System.out.println((metr * 0.00062) + " мили");
        } else if (choice.equals("dujm")) {
            System.out.println((metr * 39.37) + " дюймов");
        } else if (choice.equals("jard")) {
            System.out.println((metr * 1.09) + " ярдов");
        } else System.out.println("Неверное действие");
    }
}
