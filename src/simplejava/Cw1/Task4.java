package simplejava.Cw1;

import java.util.Scanner;

/**
 * Задание 4
 * Пользователь вводит с клавиатуры два числа. Первое
 * число — это значение, второе число процент, который
 * необходимо посчитать. Например, мы ввели с клавиатуры
 * 50 и 10. Требуется вывести на экран 10 процентов от 50.
 * Результат: 5.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите процент");
        double b = in.nextDouble();
        in.close();
        double proc = (a * (b / 100));
        //   System.out.printf("%f процентов от %d \n", b, a);
        //   System.out.printf("Результат: %f", proc);
        System.out.println(String.format("%.0f", b) + " процентов от числа " + a);
        //  System.out.printf("String.format(%.2f, %f) процентов от %d \n", b, a);
        //  System.out.printf("String.format(%.2f, %f) процентов от %d \n", b, a);
        System.out.println("Результат: " + String.format("%.2f", proc));


    }
}
