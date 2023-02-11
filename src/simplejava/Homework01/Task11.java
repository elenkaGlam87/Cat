package simplejava.Homework01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Задание 11
 * Заполнить массив размерности n словами, состоящими только из строчных латинских букв.
 * Слова между собой разделены пробелами, количество пробелов случайное – от 1 до 5.
 * Подсчитать общее количество слов в массиве. n – задается с клавиатуры
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = in.nextInt();
        int count = 0;
        in.nextLine();
        String[] word = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово");
            word[i] = in.nextLine();
        }
        System.out.println("Введён массив " + Arrays.toString(word));

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(word[i], " ");
            while (st.hasMoreTokens()) {
                count++;
                st.nextToken();
            }
        }
        System.out.println("В заданном массиве " + count + " слов(а)");
    }
}
