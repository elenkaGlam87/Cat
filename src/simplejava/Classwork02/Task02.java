package simplejava.Classwork02;

import java.util.Scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры число, состоящее из четырех цифр. Требуется найти произведение цифр.
 * Например, если с клавиатуры введено 1324, тогда результат произведения 1*3*2*4 = 24.
 */

public class Task02 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Введите число");
        int num = m.nextInt();
        m.close();
        int result = numProizved(num);
        System.out.println(result);
    }

    public static int numProizved (int num) {
        int num_1 = num % 10;
        int num_2 = (num / 10) % 10;
        int num_3 = (num / 100) % 10;
        int num_4 = (num / 1000) % 10;
        int q = num_4 * num_3 * num_2 * num_1;
        return q;
    }
}
