package simplejava.Cw1;

/**
 * Задание 2
 * Выведите на экран надпись «"Your time is limited, so
 * don’t waste it living someone else’s life" Steve Jobs» на разных
 * строках. Пример вывода:
 * "Your time is limited,
 * so don’t waste it
 * living someone else’s life"
 * Steve Jobs.
 */

public class Task2 {
    public static void main(String[] args) {
        String a = "\"Your time is limited,";
        String b = "   so don’t waste it";
        String c = "       living someone else’s life\"";
        String d = "             Steve Jobs";
        System.out.print(a + '\n' + b + '\n' + c + '\n' + d + '\n');

    }
}
