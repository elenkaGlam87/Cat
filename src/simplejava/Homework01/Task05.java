package simplejava.Homework01;

import java.util.Arrays;

/**
 * Задание 5
 * Заполнить массив на 10 элементов случайными числами от -10 до +10.
 * Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы и количество повторений.
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 1 раз
 */

public class Task05 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int count;
        for (count = 0; count < numbers.length; ++count) {
            numbers[count] = (int) (Math.random() * 21.0D) - 10;
        }
        System.out.println(Arrays.toString(numbers));
        int number = 0;
        int repeat = 0;
        Arrays.sort(numbers);


        for (int i = 0; i < numbers.length; ++i) {
            count = 1;

            for (int j = i + 1; j < numbers.length; ++j) {
                number = numbers[i];
                if (numbers[i] == numbers[j]) {
                    ++count;
                }
            }
            if (count != 1) {
                repeat = count;
                System.out.println("Number " + number + " was found " + count + " times");
            }
        }
        if (repeat == 0) {
            System.out.println("there is no repeated numbers");
        }
    }
}


