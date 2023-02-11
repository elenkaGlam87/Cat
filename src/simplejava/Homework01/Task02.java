package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 2
 * Заполнить массив на 30 элементов случайными числами от -70 до +50.
 * Найти минимальный элемент и вывести его на консоль.
 * Найти максимальный элемент и вывести его на консоль.
 */

public class Task02 {
    public static void main(String[] args) {

        Random w = new Random();

        int[] mass = new int[30];
        int min = -70;
        int max = 50;
        int minElement = mass[0];
        int maxElement = mass[0];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = w.nextInt((max - min) + 1) + min;
            if (minElement>mass[i]) {
                minElement=mass[i];
            }
            if (maxElement<mass[i]) {
                maxElement=mass[i];
            }
        }

        System.out.println("Массив: " + Arrays.toString(mass));
        System.out.println("Минимальный элемент " + minElement);
        System.out.println("Максимальный элемент " + maxElement);
    }


}
