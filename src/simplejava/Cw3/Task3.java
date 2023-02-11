package simplejava.Cw3;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 * на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num_1 = chislo.nextInt();
        System.out.println("Введите второе число");
        int num_2 = chislo.nextInt();
        System.out.println("Введите третье число");
        int num_3 = chislo.nextInt();
        System.out.println("Введите действие");
        String action = chislo.next().toLowerCase();
        int max = Math.max(num_1, Math.max(num_2, num_3));
        int min = Math.min(num_1, Math.min(num_2, num_3));
        if (action.equals("max")) {
            System.out.println("Максимальное число = " + max);
        } else if (action.equals("min")) {
            System.out.println("Минимальное число = " + min);
        } else if (action.equals("Srednee")) {
            if (num_1 != max && num_1 != min) {
                System.out.println("Среднее число = " + num_1);
            } else if (num_2 != max && num_2 != min) {
                System.out.println("Среднее число = " + num_2);
            } else {
                System.out.println("Среднее число = " + num_3);
            }
        }


    }
}
