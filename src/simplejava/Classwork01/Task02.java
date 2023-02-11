package simplejava.Classwork01;

/**
 * Задание 2
 * Выведите на экран надпись «"Your time is limited, so  don’t waste it living someone else’s life" Steve Jobs»
 * на разных строках. Пример вывода:
 * "Your time is limited,
 * so don’t waste it
 * living someone else’s life"
 * Steve Jobs.
 */

public class Task02 {
    public static void main(String[] args) {
        String x = " \"Your time is limited,";
        String y = "     so don't waste it";
        String z = "       living someone else's life\"";
        String v = "         Steve Jobs.";
        System.out.print(x + "\n" + y + "\n" + z + "\n" + v);

    }
}
