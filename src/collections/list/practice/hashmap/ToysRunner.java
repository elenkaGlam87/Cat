package collections.list.practice.hashmap;
/**
 * Создать HashMap.
 * Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Product).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов  - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 */

import java.util.HashMap;
import java.util.Map;

public class ToysRunner {
    public static void main(String[] args) {
        Map<String, Product> toys = new HashMap<>();
        toys.put("McQueen", new Product("car"));
        toys.put("Barby", new Product("doll"));
        toys.put("Teddy", new Product("bear"));
        toys.put("Tomas", new Product("train"));
        entrySet(toys);
        keySet(toys);
        values(toys);

    }

    public static void entrySet(Map<String, Product> toys) {
        for (Map.Entry<String, Product> entry : toys.entrySet()) {
            System.out.println("Ключ объекта " + entry.getKey() + " объект " + entry.getValue());
        }
    }

    public static void keySet (Map <String, Product> toys) {
        for (String s : toys.keySet()) {
            System.out.println("Ключ объекта: " + s);
        }
    }

    public static void values (Map <String, Product> toys) {
        for (Product r: toys.values()) {
            System.out.println("объект: " + r);
        }
    }
}
