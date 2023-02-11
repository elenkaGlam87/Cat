package simplejava.Classwork10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание 4.
 * Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора пользователя
 */

public class Task04 {
    public static void main(String[] args) {
        int[] mas = {43, 0, 2, 19, 1};
        System.out.println("Первоначальный массив " + Arrays.toString(mas));
        sortingArray(mas);
    }

    public static void sortingArray(int[] mas) {
        Scanner action = new Scanner(System.in);
        boolean sorted_up = false;
        boolean sorted_down = false;
        int temp;
        String up = "по возрастанию";
        String down = "по убыванию";
        System.out.println("Введите условие сортировки");
        String sorting = action.nextLine();

        if (sorting.toLowerCase().equals(up)) {
            while (!sorted_up) {
                sorted_up = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        temp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = temp;
                        sorted_up = false;
                    }
                }
            }
            System.out.println("Массив по возрастанию " + Arrays.toString(mas));
        } else if (sorting.toLowerCase().equals(down)) {
            while (!sorted_down) {
                sorted_down = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] < mas[i + 1]) {
                        temp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = temp;
                        sorted_down = false;
                    }
                }
            }
            System.out.println("Массив по убыванию " + Arrays.toString(mas));
        }
    }
}
