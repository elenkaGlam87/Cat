package simplejava.Classwork07;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 9
 * В одномерном массиве, заполненном случайными числами вычислить:
 * ■ Сумму отрицательных чисел;
 * ■ Сумму четных чисел;
 * ■ Сумму нечетных чисел;
 * ■ Произведение элементов с индексами кратными 3;
 * ■ Произведение элементов между минимальным и максимальным элементом;
 * ■ Сумму элементов, находящихся между первым и последним положительными элементами.
 */

public class Task09 {
    public static void main(String[] args) {
        Random q = new Random();
        int[] mas = new int[11];
        int min = -5;
        int max = 5;
        int negativeSum = 0;
        int chetSum = 0;
        int nechetSum = 0;
        int multiply = 1;
        int minElement = mas[0];
        int maxElement = mas[0];
        int indexMin = 0;
        int indexMax = 0;
        int multiplyBetweenNumbers = 1;
        int firstPositiveIndex = 0;
        int lastPositiveIndex = 0;
        int sumPositive = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = q.nextInt((max - min) + 1) + min;
            if (mas[i] < 0) {
                negativeSum += mas[i];
            }
            if (mas[i] % 2 == 0) {
                chetSum += mas[i];
            } else {
                nechetSum += mas[i];
            }
            if (i % 3 == 0 && mas[i] != 0) {
                multiply *= mas[i];
            }
            if (minElement > mas[i]) {
                minElement = mas[i];
                indexMin = i;
            }
            if (maxElement < mas[i]) {
                maxElement = mas[i];
                indexMax = i;
            }
            if (indexMin < indexMax) {
                for (int j = indexMin + 1; j < indexMax; j++) {

                    multiplyBetweenNumbers *= mas[j];
                }
            } else {
                for (int j = indexMax + 1; j < indexMin; j++) {

                    multiplyBetweenNumbers *= mas[j];
                }
            }
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] > 0) {
                    firstPositiveIndex = j;
                    break;
                }
            }
            for (int j = mas.length-1; j >=0; j--) {
                if (mas[j]>0) {
                    lastPositiveIndex=j;
                    break;
                }
            }
            for (int j = firstPositiveIndex+1; j < lastPositiveIndex; j++) {
                sumPositive+=mas[j];
                            }

        }
        System.out.println("Массив " + Arrays.toString(mas));
        System.out.println("Сумма отрицательных элементов: " + negativeSum);
        System.out.println("Сумма четных элементов: " + chetSum);
        System.out.println("Сумма нечетных элементов: " + nechetSum);
        System.out.println("Произведение элементов с индексами кратными 3: " + multiply);
        System.out.println("Произведение элементов между минимальным и максимальным элементом: " + multiplyBetweenNumbers);
        System.out.println("Сумма элементов между первым и последним положит. элементами: " + sumPositive);
        System.out.println(firstPositiveIndex);
        System.out.println(lastPositiveIndex);
    }
}
