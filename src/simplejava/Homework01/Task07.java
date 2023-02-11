package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание 7
 * Заполнить массив размерности n случайными цифрами от 3 до 13. Подсчитать, сколько раз встречается каждая цифра.
 * Вывести результат на экран. n – задается с клавиатуры
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = q.nextInt();

        Random r = new Random();
        int min = 3;
        int max = 13;

        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt((max - min) + 1) + min;
        }
        q.close();
        Arrays.sort(mass);
        System.out.println("Массив" + Arrays.toString(mass));

        int number = 0;
        int repeat = 0;
        int count = 0;

        for (int i = 0; i < mass.length; i++) {
            if (i != 0 && mass[i] == mass[i - 1]) {
                continue;
            }

            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
            System.out.println("Элемент " + mass[i] + " встречается " + count + " раз(а)");
            count = 0;
        }
    }
}
