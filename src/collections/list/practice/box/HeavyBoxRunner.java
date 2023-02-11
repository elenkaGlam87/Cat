package collections.list.practice.box;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Создать динамический массив, содержащий объекты класса HeavyBox.
 * Распечатать его содержимое используя for each.
 * Изменить вес первого ящика на 1.
 * Удалить последний ящик.
 * Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * Удалить все ящики.
 */

public class HeavyBoxRunner {
    public static void main(String[] args) {
        List<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(5));
        boxList.add(new HeavyBox(1));
        boxList.add(new HeavyBox(3));
        boxList.add(new HeavyBox(7));

        System.out.println("Вывод содержимого, используя for");

        for (int i = 0; i < boxList.size(); i++) {
            System.out.println(boxList.get(i));
        }

        System.out.println("Вывод содержимого, используя for each");

        for (HeavyBox box : boxList) {
            System.out.println(box);
        }

        Iterator<HeavyBox> boxs = boxList.iterator();

        while (boxs.hasNext()) {
            System.out.println(boxs.next());
        }

//        HeavyBox box1 = boxList.get(0);
//        box1.setWeight(1);

        boxList.get(0).setWeight(1);
        System.out.println(boxList.get(0));

        boxList.remove(boxList.size()-1);
        System.out.println(boxList);
        boxList.clear();
        System.out.println(boxList);
        System.out.println(boxList.hashCode());





    }
}
