package simplejava.Cw2;

import java.util.Scanner;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры число, состоящее
 * из четырех цифр. Требуется найти произведение цифр.
 * Например, если с клавиатуры введено 1324, тогда результат произведения 1*3*2*4 = 24
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = vvod.nextInt();
        int x=a%10;
        int y=(a/10)%10;
        int z=(a/100)%10;
        int w=(a/1000)%10;
        System.out.println(w*z*y*x);
        vvod.close();
    }
}
