package simplejava.Homework01;

/**
 * Задание 3
 * Написать программу, которая проверяет, все ли значения элементов массива одинаковые.
 * Вывести: Yes – если все одинаковы и No – если имеется хоть одно различие. Массив задается и инициализируется
 * вначале программы
 */

public class Task03 {
    public static void main(String[] args) {
        int[] mass = {5, 5, 5, 4, 5, 5};
        boolean flag = false;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == mass[i + 1]) {
                flag = true;
            } else {
                flag = false;
                System.out.println("No");
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        }
    }
}
