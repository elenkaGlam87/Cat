package simplejava.Classwork07;

/**
 * Задание 8
 * В одномерном массиве, заполненном случайными числами, определить минимальный и максимальный
 * элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов,
 * посчитать количество нулей. Результаты вывести на экран.
 */

public class Task08 {
    public static void main(String[] args) {
        int[] mas = {1, 0, 5, 9, -7, -3, 15, 0, 0, -2};
        int min = mas[0];
        int max = mas[0];
        int count_plus = 0;
        int count_min = 0;
        int count_null = 0;
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
            if (max < mas[i]) {
                max = mas[i];
            }
            if (mas[i] > 0) {
                count_plus++;
            } else if (mas[i] < 0) {
                count_min++;
            } else if (mas[i] == 0) {
                count_null++;
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество положительных элементов: " + count_plus);
        System.out.println("Количество отрицательных элементов: " + count_min);
        System.out.println("Количество нулей: " + count_null);
    }
}
