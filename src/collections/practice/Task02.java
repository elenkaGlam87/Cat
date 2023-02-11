package collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает количество
 * уникальных (т. е. без дубликатов) целых чисел в этом списке.
 * При получении пустого списка метод должен вернуть 0.
 */

public class Task02 {
    public static void main(String[] args) {
        List<Integer> strings = Arrays.asList(1, 6, 4, 7);
        System.out.println(Task02.countUnique(strings));
    }

    public static Integer countUnique(List<Integer> strings) {
        Set<Integer> newList = new HashSet<>(strings);
        if (newList.size() != 0) {
            return newList.size();
        } else {
            return 0;
        }
    }
}

