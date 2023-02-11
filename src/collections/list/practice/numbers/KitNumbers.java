package collections.list.practice.numbers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
 * Избавиться от повторяющихся элементов в строке.
 * Вывести результат на экран.
 */

public class KitNumbers {
    public static void main(String[] args) {
        List <Integer> kitNumbers = List.of(1,2,3,4,4,5);
        Set <Integer> newKitNumbers = new HashSet<>(kitNumbers);
        System.out.println(newKitNumbers);
    }
}
