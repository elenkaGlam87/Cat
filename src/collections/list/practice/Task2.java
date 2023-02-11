package collections.list.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Введи с клавиатуры 5 слов в список строк. Удали 3-й элемент списка, и выведи оставшиеся элементы в обратном порядке.
 */

public class Task2 {
    public static void main(String[] args) {
        List<String> newCollections = new ArrayList<>();
        newCollections.add("apple");
        newCollections.add("pear");
        newCollections.add("orange");
        newCollections.add("watermelon");
        newCollections.add("banana");

        newCollections.remove(2);
        System.out.println(newCollections);

        Collections.reverse(newCollections);
        System.out.println(newCollections);
    }
}
