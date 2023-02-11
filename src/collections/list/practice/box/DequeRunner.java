package collections.list.practice.box;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Создать очередь, содержащую объекты класса HeavyBox.
 * Используем класс ArrayDeque.
 * Поместить объекты в очередь с помощью метода offer().
 * Удалить объекты методом poll().
 */

public class DequeRunner {
    public static void main(String[] args) {
        Queue<HeavyBox> queueHeavyBox = new ArrayDeque<>();
        queueHeavyBox.offer(new HeavyBox(4));
        queueHeavyBox.offer(new HeavyBox(5));
        queueHeavyBox.offer(new HeavyBox(7));
        queueHeavyBox.offer(new HeavyBox(3));
        System.out.println(queueHeavyBox);

        queueHeavyBox.poll();
        queueHeavyBox.poll();
        queueHeavyBox.poll();
        queueHeavyBox.poll();

        System.out.println(queueHeavyBox);

    }
}
