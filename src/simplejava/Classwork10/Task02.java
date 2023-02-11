package simplejava.Classwork10;

/**
 * Задание 2
 * Напишите метод для нахождения максимума в массиве. Массив передаётся в качестве параметра.
 */

public class Task02 {
    public static void main(String[] args) {
        int[] mas = {2, 15, 0, 29, 1};
        int maxEl = maxElementArray(mas);
        System.out.println("Максимальный элемент " + maxEl);
    }

    public static int maxElementArray(int[] mas) {
        int maxElement = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[0] < mas[i]) {
                maxElement = mas[i];
            }
        }
        return maxElement;
    }
}
