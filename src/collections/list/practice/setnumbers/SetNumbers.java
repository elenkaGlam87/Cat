package collections.list.practice.setnumbers;

import java.util.HashSet;
import java.util.Set;

/**
 * Методы union() и intersect()
 * Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения множеств.
 * Протестируйте работу этих методов на предварительно заполненных множествах.
 */

public class SetNumbers {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(6);
        set2.add(1);
        set2.add(2);
        set2.add(4);
        set2.add(6);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println("Объединённое множество: " + union(set1, set2));
        System.out.println("Пересечение множеств:" + intersect(set1, set2));
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setResult = new HashSet<>(set1);
        setResult.addAll(set2);
        return setResult;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setResult = new HashSet<>(set1);
        setResult.retainAll(set2);
        return setResult;
    }


}
