package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {

        List <String> firstCollection = new ArrayList<>();

      //  System.out.println("Начальный размер коллекции: " + firstCollection.size());

        firstCollection.add("one");
        firstCollection.add("two");
        firstCollection.add("three");

       // System.out.println("Размер коллекции после добавления: " + firstCollection.size());

        firstCollection.add(1, "four");
        for (String s : firstCollection) {
       //     System.out.println("Элемент коллекции: " + s);
        }

       // System.out.println("В 0 индексе содержится элемент: " + firstCollection.get(0));
         List<String> secondCollection = firstCollection.subList(1, 3);
        for (String string : secondCollection) {
        //    System.out.println("Элемент новой коллекции: " + string);
        }
        System.out.println();
        firstCollection.addAll(secondCollection);
        for (int i = 0; i < firstCollection.size(); i++) {
        //    System.out.println("Элемент дополненной коллекции: " + firstCollection.get(i));
        }

       // System.out.println(firstCollection.contains("ten"));

       // System.out.println(firstCollection.indexOf("four"));
        //System.out.println(firstCollection.lastIndexOf("four"));
       // System.out.println(firstCollection.isEmpty());
        firstCollection.remove("four");
        for (int i = 0; i < firstCollection.size(); i++) {
          //  System.out.println("Элемент дополненной коллекции: " + firstCollection.get(i));
        }

     List <String> myCollection = List.of("fgh", "vbn", "oiu", "wes");
    }
}
