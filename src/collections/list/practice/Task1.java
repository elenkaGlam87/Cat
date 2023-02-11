package collections.list.practice;
/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строк.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл выведи его содержимое на экран через цикл for, for each, while(итератором),
 * каждое значение с новой строки.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> myStrings = new ArrayList<>();
        myStrings.add("white");
        myStrings.add("red");
        myStrings.add("black");
        myStrings.add("yellow");
        myStrings.add("blue");
        System.out.println("Размер коллекции: " + myStrings.size());
        for (int i = 0; i <myStrings.size(); i++) {
            System.out.println("Значение " + i + " элемента коллекции равно: " + myStrings.get(i));
        }

        for (String myString : myStrings) {
            System.out.println(myString);
        }

        System.out.println();

        Iterator <String> myIterator = myStrings.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }






    }
}
