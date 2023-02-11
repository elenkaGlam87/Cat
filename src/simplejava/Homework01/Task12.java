package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание 12
 * Программа должна выводить слово Yes для симметричного массива и слово No – для несимметричного.
 * Симметричным считается массив, в котором значения элементов с конца равно значению элементов с начала.
 * Массив задается и инициализируется в начале программы.
 * Примеры значений для симметричного массива:
 * 1, 2, 3, 2, 1
 * 2, 2, 3, 2, 2
 * 1, 3, 2, 3, 1
 * 5, 4, 3, 4, 5
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        Random t = new Random();
        int min = 0;
        int max = 23;
        int count = 0;
        int[] mass = new int[size];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = t.nextInt((max - min) + 1) + min;
        }
        System.out.println("Массив " + Arrays.toString(mass));

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == mass[mass.length - 1 - i]) {
                count++;
            }
        }
        if (count == mass.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}




