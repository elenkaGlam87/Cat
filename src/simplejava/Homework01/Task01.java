package simplejava.Homework01;

import java.util.Arrays;

/**
 * Задание 1
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 */

public class Task01 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        mass[0] = 0;
        mass[1] = 1;
        int chetElement = 0;
        for (int i = 2; i < mass.length; i++) {
            mass[i] = mass[i - 1] + mass[i - 2];
            if (mass[i] % 2 == 0) {
                chetElement = mass[i];
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println('\n' + "Массив" + Arrays.toString(mass));
    }
}
