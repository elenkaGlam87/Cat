package simplejava.Classwork06;

import java.util.Scanner;

/**
 * Задание 4
 * Показать на экран все простые числа в диапазоне, указанном пользователем.
 * Число называется простым, если оно делится без остатка только на себя и на единицу.
 * Например, три — это простое число, а четыре нет.
 */

public class Task04 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = q.nextInt();
        System.out.println("Введите второе число");
        int num_2 = q.nextInt();
        for (int i = num_1; i <= num_2; i++) {
            if (i%i==0 && i%1==0 && i%2!=0 && i%3!=0) {
                System.out.println(i + " простое число");
            } else if (i==2 || i ==3) {
                System.out.println(i + " простое число");
            } else System.out.println(i + " непростое число");
        }
    }
}
