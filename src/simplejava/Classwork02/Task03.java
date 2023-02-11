package simplejava.Classwork02;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры количество метров. Требуется вывести результат перевода метров в
 * сантиметры, дециметры, миллиметры, мили
 * 1м=0,00062 мили
 */

public class Task03 {
    public static void main(String[] args) {
        perevodMetr();
    }

    public static void perevodMetr() {
        Scanner y = new Scanner(System.in);
        System.out.println("Введите количество метров");
        double metr = y.nextDouble();
        y.close();
        double sm = metr * 100;
        double dm = metr * 10;
        double mm = metr * 1000;
        double mil = metr * 0.00062;
        System.out.println(metr + " м равно " + sm + " см");
        System.out.println(metr + " м равно " + dm + " дм");
        System.out.println(metr + " м равно " + mm + " мм");
        System.out.println(metr + " м равно " + mil + " мили");
    }
}
