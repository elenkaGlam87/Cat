package simplejava.Dz1;

/**
 * В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
 * ■ результат целочисленного деления x на y;
 * ■ остаток от деления x на y;
 * ■ квадратный корень x.
 */

public class Task1 {

    public static void main(String[] args) {

        int x = 7;
        int y = 2;

        System.out.println("результат целочисленного деления x на y равен: " + (x / y));
        System.out.println("остаток от деления x на y равен: " + (x % y));

        double c = Math.sqrt(x);
        System.out.println(c);


    }


}
