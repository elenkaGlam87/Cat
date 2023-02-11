package collections.list.practice.box;
/**
 * Создать TreeSet содержащий HeavyBox.
 * HeavyBox должен реализовать интерфейс Comparable.
 * Распечатать содержимое с помощью for each.
 */

import java.util.TreeSet;

public class TreeSetRun {
    public static void main(String[] args) {
        TreeSet<HeavyBox> setBox = new TreeSet<>();
        setBox.add(new HeavyBox(4));
        setBox.add(new HeavyBox(8));
        setBox.add(new HeavyBox(2));
        setBox.add(new HeavyBox(6));
        setBox.add(new HeavyBox(3));

        for (HeavyBox box: setBox) {
            System.out.println(box);
        }



    }





}
