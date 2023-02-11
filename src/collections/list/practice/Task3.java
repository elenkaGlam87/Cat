package collections.list.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 3. Выражаемся покороче
 *
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */

public class Task3 {
    public static void main(String[] args) {
        List<String> myLines = new ArrayList<>();
        myLines.add("dog");
        myLines.add("elephant");
        myLines.add("kitten");
        myLines.add("crocodile");
        myLines.add("mon");
        for (String myLine : myLines) {

        }
        myLines.sort((Comparator.comparingInt(String::length)));



        int shortString = myLines.get(0).length();
        int index = 0;
        for (int i = 0; i < myLines.size(); i++) {
            if (myLines.get(i).length() < myLines.get(0).length() || myLines.get(i).length() == myLines.get(0).length()) {
                shortString = myLines.get(i).length();
                index = i;
                System.out.println(myLines.get(index));
            }

        }
    }
}
