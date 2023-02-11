package collections.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Написать метод isUnique, который принимает Map<String, String> и возвращает true, если каждому ключу соответствует свое уникальное
 * значение.
 * Например, в данном случае вернется true:
 * {Marty=Step, Stuart=Rages, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 * А в данном случае вернется false:
 * {Kendrick-Perkins, Stuart=Rages, Jessica=Miller, Bruce=Rages, Amanda=Camp, Hal=Perkins}
 */

public class Task03 {
    public static void main(String[] args) {
        Map<String, String> strings = new HashMap<>();
        strings.put("Marty", "Step");
        strings.put("Stuart", "Rages");
        strings.put("Jessica", "Miller");
        strings.put("Amanda", "Step");
        strings.put("Hal", "Perkins");
        System.out.println(isUnique(strings));

    }

    public static boolean isUnique(Map<String, String> strings) {
        Set<String> setValue = new HashSet<>(strings.values());
        return strings.size() == setValue.size();
    }
}
