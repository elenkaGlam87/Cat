package simplejava.Dz1;

/**
 * Задание 9
 * Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
 * и 10.0 – нет
 */
public class Task9 {
    public static void main(String[] args) {
        double a = 15.0;
        double b = a % 1;
        System.out.println(b);
    }
}
