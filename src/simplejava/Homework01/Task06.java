package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 6
 * Заполнить массив на 10 элементов случайными числами от -10 до +10.
 * Посчитать количество уникальных значений (встречающихся в массиве один раз).
 * Вывести на консоль значения уникальных элементов и индексы, под которыми они находятся в массиве.
 */

public class Task06 {
    public static void main(String[] args) {
        Random t = new Random();
        int min = -10;
        int max = 10;

        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = t.nextInt((max - min) + 1) + min;
        }
        Arrays.sort(mass);
        System.out.println("Массив " + Arrays.toString(mass));

        int number = 0;
        int count;
        int index;

        for (int i = 0; i < mass.length; i++) {
            count = 0;

            for (int j = 0; j < mass.length; j++) {
                number = mass[i];
                if (mass[i] == mass[j]) {
                    ++count;
                }
            }
            if (count == 1) {

                System.out.println("Индекс " + i + " элемент " + number);
            }
            count = 0;
        }
    }
}







