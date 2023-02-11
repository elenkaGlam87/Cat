package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание 9
 * Заполнить массив размерности n случайными цифрами от –2 до n. Если в массиве есть хотя бы одно отрицательное
 * значение меньше -1, заменить все отрицательные значение в массиве на квадрат (в степени 2) этих значений.
 * Вывести исходный и результирующий массив на консоль.
 */

public class Task09 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = w.nextInt();
        Random q = new Random();
        int[] mas = new int[n];
        int min = -2;
        int count = 0;

        for (int i = 0; i < n; i++) {
            mas[i] = q.nextInt((n - min) + 1) + min;
        }
        Arrays.sort(mas);
        System.out.println("Массив " + Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                if (mas[i] <= -1) {
                    mas[i] = (int) Math.pow(mas[i], 2);
                }
            }
        }
        System.out.println("Новый массив " + Arrays.toString(mas));


    }
}
