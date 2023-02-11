package simplejava.Classwork01;

import java.util.Scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры два числа. Первое число — это значение, второе число процент, который
 * необходимо посчитать. Например, мы ввели с клавиатуры 50 и 10. Требуется вывести на экран 10 процентов от 50.
 * Результат: 5.
 */

public class Task04 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num_1 = f.nextDouble();
        System.out.println("Введите второе число");
        double num_2 = f.nextDouble();
        double w=percentNumber(num_1,num_2);
        System.out.println(num_2 + " процентов от " + num_1);
        System.out.println("Результат: " + w);
        f.close();
    }

    public static double percentNumber (double first, double second) {

        double z = first * (second / 100);
        return z;

    }

}
