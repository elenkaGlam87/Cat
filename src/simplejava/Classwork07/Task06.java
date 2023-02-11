package simplejava.Classwork07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Пользователь с клавиатуры вводит элементы одномерного массива. Необходимо найти сумму элементов
 * массива, среднеарифметическое, отобразить на экран все элементы массива
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int[] mas = new int[10];
        int result = 0;
        int count=0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите " + i + " элемент массива");
            mas[i] = w.nextInt();
            result = result + mas[i];
            count++;
                    }
        System.out.println("Массив " + Arrays.toString(mas));
        System.out.println("Сумма элементов массива: " + result);
        System.out.println("Среднеарифметическое элементов массива: " + (result/count));
        w.close();
    }
}
