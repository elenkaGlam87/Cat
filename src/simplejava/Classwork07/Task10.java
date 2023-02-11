package simplejava.Classwork07;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 10
 * Есть одномерный массив, заполненный случайными числами. На основании данных этого массива нужно:
 * ■ Создать одномерный массив, содержащий только четные числа из первого массива;
 * ■ Создать одномерный массив, содержащий только нечетные числа из первого массива;
 * ■ Создать одномерный массив, содержащий только отрицательные числа из первого массива;
 * ■ Создать одномерный массив, содержащий только положительные числа из первого массива
 */

public class Task10 {
    public static void main(String[] args) {
        Random w = new Random();
        int[] mas = new int[10];
        int[] newMasChet;
        int[] newMasNechet;
        int[] newMasNegativ;
        int[] newMasPositiv;
        int minElement = -10;
        int maxElement = 10;
        int countChet = 0;
        int countNechet = 0;
        int countNegativ = 0;
        int countPositiv = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = w.nextInt((maxElement - minElement) + 1) + minElement;
            if (mas[i] % 2 == 0) {
                countChet++;
            } else countNechet++;
            if (mas[i] < 0) {
                countNegativ++;
            }
            if (mas[i] > 0) {
                countPositiv++;
            }
        }


        newMasChet = new int[countChet];
        int indexChet = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                newMasChet[indexChet] = mas[i];
                indexChet++;
            }
        }


        newMasNechet = new int[countNechet];
        int indexNechet = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 != 0) {
                newMasNechet[indexNechet] = mas[i];
                indexNechet++;
            }
        }


        newMasNegativ = new int[countNegativ];
        int indexNegative = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                newMasNegativ[indexNegative] = mas[i];
                indexNegative++;
            }
        }


        newMasPositiv = new int[countPositiv];
        int indexPositive = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {

                newMasPositiv[indexPositive] = mas[i];
                indexPositive++;
            }
        }

        System.out.println("Массив, заполненный случайными числами: " + Arrays.toString(mas));
        System.out.println("Массив четных чисел: " + Arrays.toString(newMasChet));
        System.out.println("Массив нечетных чисел: " + Arrays.toString(newMasNechet));
        System.out.println("Массив отрицательных чисел: " + Arrays.toString(newMasNegativ));
        System.out.println("Массив положительных чисел: " + Arrays.toString(newMasPositiv));

    }
}


