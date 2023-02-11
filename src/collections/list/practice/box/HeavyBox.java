package collections.list.practice.box;

import java.util.Objects;

/**
 * Создать динамический массив, содержащий объекты класса HeavyBox.
 * Распечатать его содержимое используя for each.
 * Изменить вес первого ящика на 1.
 * Удалить последний ящик.
 * Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * Удалить все ящики.
 */

public class HeavyBox implements Comparable<HeavyBox> {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Эта коробка весом: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }



//    @Override
//    public int compareTo(HeavyBox o) {
//        return Integer.compare(weight, o.weight);
//    }

    @Override
    public int compareTo(HeavyBox o) {
        if (weight == o.weight) {
            return 0;
        } else if (weight > o.weight) {
            return 1;
        } else return -1;
    }
}
