package simplejava.Classwork10;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 3
 * Напишите метод, определяющий количество чётных, нечётных, положительных, отрицательных элементов массива.
 * Массив передаётся в качестве параметра.
 */

public class Task03 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int minElement = -10;
        int maxElement = 15;
        Random q = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = q.nextInt((maxElement - minElement) + 1) + minElement;
        }
        System.out.println("Массив " + Arrays.toString(mas));
        masElement(mas);
    }

    public static void masElement(int[] mas) {
        int evenElement = 0;
        int oddElement = 0;
        int positiveElement = 0;
        int negativeElement = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0 && mas[i] != 0) {
                evenElement++;
            } else if (mas[i] % 2 != 0 && mas[i] != 0) {
                oddElement++;
            }
            if (mas[i] > 0) {
                positiveElement++;
            } else if (mas[i] < 0) {
                negativeElement++;
            }
        }
        System.out.println("Количество четных элементов " + evenElement);
        System.out.println("Количество нечетных элементов " + oddElement);
        System.out.println("Количество положительных элементов " + positiveElement);
        System.out.println("Количество отрицательных элементов " + negativeElement);
    }
}
