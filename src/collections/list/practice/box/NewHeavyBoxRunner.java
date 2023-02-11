package collections.list.practice.box;
/**
 * Разделение коллекции.
 * Создать коллекцию, содержащую объекты HeavyBox.
 * Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
 * Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */

import java.util.ArrayList;
import java.util.List;

public class NewHeavyBoxRunner {
    public static void main(String[] args) {
        List <HeavyBox> newBox = new ArrayList<>();
        newBox.add(new HeavyBox(180));
        newBox.add(new HeavyBox(500));
        newBox.add(new HeavyBox(200));
        newBox.add(new HeavyBox(400));

        List <HeavyBox> box2 = new ArrayList<>();
        System.out.println(newBox);
        System.out.println(sortBox(newBox, box2));
        System.out.println(newBox);

    }
    public static List<HeavyBox> sortBox (List<HeavyBox> newBox, List <HeavyBox> box2) {
        for (int i = 0; i <newBox.size(); i++) {
            if (newBox.get(i).getWeight()>300) {
                box2.add(newBox.get(i));
                newBox.remove(i);
            }
        }
        return box2;
    }

}
