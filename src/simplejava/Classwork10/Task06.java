package simplejava.Classwork10;

import java.util.Arrays;

/**
 * Задание 7.
 * Напишите метод, высчитывающий факториал каждого элемента массива.
 * Метод возвращает новый массив, содержащий полученные факториалы.
 */

public class Task06 {
    public static void main(String[] args) {

    int[] mas = {3, 1, 5, 2};
        System.out.println("Новый массив " + Arrays.toString(newMas(mas)));
    }

    public static int factorialArray(int num) {

        int z = 1;
        for (int i = 1; i <= num; i++) {
            z *= i;
        }
        return z;
    }

    public static int [] newMas (int [] mas) {

        int [] mas1=new int[mas.length];

        for (int i = 0; i <mas.length; i++) {
            mas1[i] = factorialArray(mas[i]);
        }
        return mas1;
    }
}

