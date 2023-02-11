package simplejava.Classwork06;

import java.util.Scanner;

/**
 * Показать на экран таблицу умножения в диапазоне,
 * указанном пользователем. Например, если пользователь
 * указал 3 и 5, таблица может выглядеть так:
 * 3*1 = 3 3*2 = 6 3*3 = 9 .... 3* 10 = 30
 * .......................................
 * 5*1 = 5 5 *2 = 10 5 *3 = 15 ...........
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = num.nextInt();
        System.out.println("Введите второе число");
        int num_2 = num.nextInt();
        for (int i = num_1; i <= num_2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }

    }
}
