package simplejava.Classwork08;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 1
 * Два одномерных массива заполняются случайными числами. Необходимо:
 * ■ Сформировать третий массив, содержащий элементы обоих массивов;
 * ■ Сформировать третий массив, содержащий элементы обоих массивов без повторений;
 * ■ Сформировать третий массив, содержащий элементы общие для двух массивов;
 * ■ Сформировать третий массив, содержащий только уникальные элементы каждого из массивов;
 * ■ Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из массивов.
 */

public class Task01 {
    public static void main(String[] args) {
        int[] mass_1 = new int[5];
        int minMass1 = -5;
        int maxMass1 = 20;
        int[] mass_2 = new int[5];
        int minMass2 = -8;
        int maxMass2 = 35;
        Random q = new Random();

        int mass_3[] = new int[mass_1.length + mass_2.length];
        int f = 0;


        for (int i = 0; i < mass_1.length; i++) {
            mass_1[i] = q.nextInt((maxMass1 - minMass1) + 1) + minMass1;
            mass_3[f] = mass_1[i];
            f += 1;
        }
        System.out.println("Массив 1 " + Arrays.toString(mass_1));

        for (int i = 0; i < mass_2.length; i++) {
            mass_2[i] = q.nextInt((maxMass2 - minMass2) + 1) + minMass2;
            mass_3[f] = mass_2[i];
            f += 1;
        }
        System.out.println("Массив 2 " + Arrays.toString(mass_2));
        System.out.println("Объединённый " + Arrays.toString(mass_3));
        f = 0;
        int temp = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mass_3.length - 1; i++) {
                if (mass_3[i] > mass_3[i + 1]) {
                    temp = mass_3[i];
                    mass_3[i] = mass_3[i + 1];
                    mass_3[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Массив после сортировки " + Arrays.toString(mass_3));
        int unique = mass_3.length;
        for (int i = 0; i < mass_3.length; i++) {
            while (i + 1 < mass_3.length && mass_3[i] == mass_3[i + 1]) {
                i++;
                unique--;
            }
        }
        int[] mass_4 = new int[unique];
        for (int i = 0; i < mass_3.length; i++) {
            mass_4[f++] = mass_3[i];
            while (i + 1 < mass_3.length && mass_3[i] == mass_3[i + 1]) {
                i++;
            }
        }
        System.out.println("Массив без повторений " + Arrays.toString(mass_4));
        f = 0;
        int[] mass_5 = new int[mass_3.length - unique];
        for (int i = 0; i < mass_3.length; i++) {
            while (i + 1 < mass_3.length && mass_3[i] == mass_3[i + 1]) {
                i++;
                mass_5[f++] = mass_3[i];
            }
        }
        System.out.println("Массив общих элементов " + Arrays.toString(mass_5));

        // Находим максимальные и минимальные значения массивов.
        int minElementMas1 = mass_1[0];
        int maxElementMas1 = mass_1[0];
        int minElementMas2 = mass_2[0];
        int maxElementMas2 = mass_2[0];
        int indexMinMas1 = 0;
        int indexMaxMas1 = 0;
        int indexMinMas2 = 0;
        int indexMaxMas2 = 0;

        for (int i = 0; i < mass_1.length; i++) {
            if (minElementMas1 > mass_1[i]) {
                minElementMas1 = mass_1[i];
                indexMinMas1 = i;
            }
            if (maxElementMas1 < mass_1[i]) {
                maxElementMas1 = mass_1[i];
                indexMaxMas1 = i;
            }
        }
        System.out.println("Минимальный элемент первого массива " + minElementMas1);
        System.out.println("Максимальный элемент первого массива " + maxElementMas1);

        for (int i = 0; i < mass_2.length; i++) {
            if (minElementMas2 > mass_2[i]) {
                minElementMas2 = mass_2[i];
                indexMinMas2 = i;

            }
            if (maxElementMas2 < mass_2[i]) {
                maxElementMas2 = mass_2[i];
                indexMaxMas2 = i;
            }
        }
        System.out.println("Минимальный элемент второго массива " + minElementMas2);
        System.out.println("Максимальный элемент второго массива " + maxElementMas2);

        int[] massMinMax = new int[4];
        massMinMax[0] = minElementMas1;
        massMinMax[1] = maxElementMas1;
        massMinMax[2] = minElementMas2;
        massMinMax[3] = maxElementMas2;
        System.out.println("Массив max и min значений " + Arrays.toString(massMinMax));

        int size1 = mass_1.length;
        int size2 = mass_2.length;
        for (int i = 0; i < mass_1.length; i++) {
            while (i + 1 < mass_1.length && mass_1[i] == mass_1[i + 1]) {
                i++;
                size1--;
            }
        }
        for (int i = 0; i < mass_2.length; i++) {
            while (i + 1 < mass_2.length && mass_2[i] == mass_2[i + 1]) {
                i++;
                size2--;
            }
        }
        int[] massNew = new int[size1 + size2];
        f = 0;
        for (int i = 0; i < mass_1.length; i++) {
            massNew[f++] = mass_1[i];
            while (i + 1 < mass_1.length && mass_1[i] == mass_1[i + 1]) {
                i++;
            }
        }
        for (int i = 0; i < mass_2.length; i++) {
            massNew[f++] = mass_2[i];
            while (i + 1 < mass_2.length && mass_2[i] == mass_2[i + 1]) {
                i++;
            }
        }
        System.out.println("Массив элементов без повторений " + Arrays.toString(massNew));

    }
}
