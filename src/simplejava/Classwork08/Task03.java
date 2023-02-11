package simplejava.Classwork08;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 3
 * Есть одномерный массив из 15 элементов, заполненный случайными числами.
 * Необходимо первые 7 элементов отсортировать по возрастанию, оставшиеся 8 элементов по убыванию.
 * Выбор алгоритма сортировки необходимо обосновать вашему преподавателю.
 */

public class Task03 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        Random w = new Random();
        int min = 0;
        int max = 15;
        int temp = 0;


        for (int i = 0; i < mass.length; i++) {
            mass[i] = w.nextInt((max - min) + 1) + min;
        }
        System.out.println("Массив " + Arrays.toString(mass));
        boolean sorted_1 = false;

        while (!sorted_1) {
            sorted_1 = true;
            for (int i = 0; i < (mass.length / 2) - 1; i++) {

                if (mass[i] > mass[i + 1]) {
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    sorted_1 = false;
                }
            }
        }
        boolean sorted_2 = false;

        while (!sorted_2) {
            sorted_2 = true;
            for (int i = mass.length / 2; i < mass.length - 1; i++) {
                if (mass[i] < mass[i + 1]) {
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    sorted_2 = false;
                }
            }
        }

        System.out.println(Arrays.toString(mass));


    }
}
