package collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * * Написать метод, который принимает целочисленный список и возвращает список только с нечетными значениями.
 */

public class Task01 {
    public static void main(String[] args) {
        List<Integer> valuesList = new ArrayList<>();
        valuesList.add(5);
        valuesList.add(4);
        valuesList.add(8);
        valuesList.add(3);
        valuesList.add(6);
        System.out.println(valuesList);

        // valuesList.removeIf(i-> i%2==0);
        // System.out.println(valuesList);
        List<Integer> newValue = new ArrayList<>();
        for (Integer integer : valuesList) {
            if (integer % 2 != 0) {
                newValue.add(integer);
            }
        }
        System.out.println(newValue);

        List<Integer> integers = List.of(1, 5, 6, 7, 9);
        List <Integer> nerInt = Arrays.asList(4,9,3,1);

    }
}
