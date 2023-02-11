package simplejava.Classwork10;

/**
 * Задание 1
 * Напишите метод, вычисляющий сумму элементов массива. Массив передаётся в качестве параметра
 */

public class Task01 {
    public static void main(String[] args) {
        int[] mas = {1, 3, 5};
        sumArray(mas);
    }

    public static void sumArray(int[] mas) {
        int result = 0;
        for (int i = 0; i < mas.length; i++) {
            result += mas[i];
        }
        System.out.println("Сумма элементов массива " + result);
    }
}
