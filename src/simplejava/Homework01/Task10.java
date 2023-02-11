package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание 10
 * Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
 * без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
 * Вывести индекс найденного элемента, если такой не найден, вывести -1. n – задается с клавиатуры.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = size.nextInt();
        int min = 0;
        int max = 33;
        int index;
        int test = 0;
        Random mas = new Random();
        int[] mas1 = new int[n];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = mas.nextInt((max - min) + 1) + min;
        }
        size.close();
        System.out.println("Массив " + Arrays.toString(mas1));

        for (int i = 1; i < mas1.length - 1; i++) {
            if (mas1[i-1]!=0 && mas1[i+1]!=0 && mas1[i] % mas1[i - 1] == 0 && mas1[i] % mas1[i + 1] == 0) {
                index = i;
                test++;
                System.out.println("индекс искомого элемента " + index);
            }
        }
        if (test == 0) {
            System.out.println("-1");
        }
    }
}
