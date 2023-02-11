package simplejava.Classwork10;

import java.util.Arrays;

/**
 * Задание 5.
 * Напишите метод, переворачивающий содержимое массива.
 */

public class Task05 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7};
        flipOverArray(mass);
    }

    public static void flipOverArray (int [] mass) {
        int [] flipOverMas= new int[mass.length];
        for (int i = mass.length-1; i >0;) {
            for (int j = 0; j < mass.length; j++) {
                flipOverMas[j]=mass[i];
                i--;
            }
        }
        System.out.println("Перевернутый массив " + Arrays.toString(flipOverMas));
    }
}
