package simplejava.Classwork09;

/**
 * Задание 4
 * Напишите метод, который возвращает максимальное из четырёх чисел. Числа передаются в качестве параметров.
 */

public class Task04 {
    public static void main(String[] args) {
        int num_1 = 4;
        int num_2 = 10;
        int num_3 = 3;
        int num_4 = 15;
        int max = maxNumber(num_1, num_2, num_3, num_4);
        System.out.println("Максимальное из четырех чисел " + max);
    }

    public static int maxNumber(int a, int b, int c, int d) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        max = max > d ? max : d;
        return max;
    }
}
