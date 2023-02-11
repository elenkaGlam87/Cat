package simplejava.Cw2;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры количество метров. Требуется вывести результат перевода метров в
 * сантиметры, дециметры, миллиметры, мили.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Введите количество метров");
        int a = m.nextInt();

        int sm = (a * 100);
        int dm = a * 10;
        int mm = a * 1000;
        double mil = a / 1609.34;
        System.out.println(sm);
        System.out.println(dm);
        System.out.println(mm);
        System.out.println(mil);
        m.close();
    }
}
