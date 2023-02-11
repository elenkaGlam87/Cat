package myhomework.base;

/**
 * Урок 12. Одномерные массивы.
 *  Создайте массив из 5 чисел типа double.
 *  Используя цикл while, выведите сумму всех чисел массива.
 *  Используя цикл for, выведите произведение всех чисел массива
 */

public class Lesson12 {
    public static void main(String[] args) {
        double[] mas = {1.2, 2.5, 5.7, 4.1, 7.2};
        plusElement(mas);
        multiplyElement(mas);
    }

    private static void plusElement(double[] mas) {
        int i = 0;
        double resultPlus = 0;
        while ((mas.length - 1) >= i) {
            resultPlus += mas[i];
            i++;
        }
        System.out.println("Сумма элементов массива равна: " + resultPlus);
    }

    private static void multiplyElement(double[] mas) {
        double resultMultiply = 1;
        for (int j = 0; j < mas.length; j++) {
            resultMultiply *= mas[j];
        }
        System.out.println("Произведение элементов массива равно: " + resultMultiply);
    }
}

