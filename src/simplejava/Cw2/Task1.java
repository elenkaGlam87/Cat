package simplejava.Cw2;

import java.util.Scanner;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
 * если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("Введите третье число");
        int c = in.nextInt();
        in.close();
        int x=((100*a)+(10*b)+c);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        sb.append(c);
        System.out.println(x);
        System.out.println(sb);

    }
}

