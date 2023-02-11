package simplejava.Classwork07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание 7
 * Пользователь с клавиатуры вводит элементы одномерного массива и некоторое число. Необходимо посчитать
 * сколько раз данное число присутствует в массиве.
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int[] mas = new int[5];
        System.out.println("Введите число");
        int value = m.nextInt();
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите " + i + " элемент массива");
            mas[i] = m.nextInt();
            if (value == mas[i]) {
                count++;
            }
        }
        m.close();
        System.out.println("Массив " + Arrays.toString(mas));
        System.out.println(value + " присутствует в массиве " + count + " раз");
    }
}
