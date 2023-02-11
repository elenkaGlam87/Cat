package simplejava.Homework01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание 8
 * Заполнить массив размерности n случайными строчными латинскими буквами.
 * Подсчитать, сколько раз встречается каждая буква.
 * Вывести буквы, которые встречаются больше 3 раз. n – задается с клавиатуры.
 */

public class Task08 {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size_mass = size.nextInt();

        Random r = new Random();
        int min = 66;
        int max = 90;
        int count = 0;
        char[] mass = new char[size_mass];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (char) (r.nextInt(max-min)+min);
        }
        Arrays.sort(mass);
        System.out.println("Массив " + Arrays.toString(mass));
        size.close();

        for (int i = 0; i < mass.length; i++) {
            if (i!= 0 && mass[i] == mass[i - 1]) {
                continue;
            }
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
            if (count > 3) {
                System.out.println("Буква " + mass[i] + " встречается больше 3-х раз");
            } else System.out.println("Буква " + mass[i] + " встречается " + count + " раз(а)");

            count=0;
        }

    }
}
