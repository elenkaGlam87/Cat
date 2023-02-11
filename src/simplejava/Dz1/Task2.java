package simplejava.Dz1;

/**
 *Задание 2
 * В переменной n хранится натуральное (целое) трехзначное число. Создайте программу, вычисляющую и
 * выводящую на экран сумму цифр числа n
 */

public class Task2 {
    public static void main(String[] args) {

        int a = 123;
        int b = a % 10;
        System.out.println(b);

        int c = (a/10) % 10;
        System.out.println(c);

        int d = (a/100) % 10;
        System.out.println(d);
        int t = b+c+d;
        System.out.println(t);

    }
}
