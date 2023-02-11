package simplejava.Classwork01;

/**
 * Задание 1
 * Выведите на экран надпись «Fall seven times and stand up eight» на разных строках. Пример вывода:
 * Fall seven times
 * and
 * stand up eight.
 */

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight.");
        System.out.println();
        System.out.print("Fall seven times" + "\n" + "and" + "\n" + "stand up eight.");
        System.out.println();
        System.out.println();
        String x = "Fall seven times";
        String y = "and";
        String z = "stand up eight.";
        System.out.print(x + "\n" + y + "\n" + z);
    }
}
