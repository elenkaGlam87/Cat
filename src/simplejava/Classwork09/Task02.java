package simplejava.Classwork09;

/**
 * Задание 2
 * Напишите метод, который принимает два числа в качестве параметра и отображает все четные числа между ними.
 */

public class Task02 {
    public static void main(String[] args) {
        int num_1 = 1;
        int num_2 = 10;
        evenNumber(num_1, num_2);
    }

    public static void evenNumber(int num_1, int num_2) {
        for (int i = num_1; i < num_2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
