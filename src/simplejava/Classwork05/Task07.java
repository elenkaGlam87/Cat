package simplejava.Classwork05;

import java.util.Scanner;

/**
 * Задание 6
 * Пользователь вводит с клавиатуры длину линии и символ для заполнения линии. Нужно отобразить на экране
 * вертикальную линию из введенного символа, указанной длины.
 * Например, если было введено 5 и символ %, тогда вывод на экран будет такой:
 * %
 * %
 * %
 * %
 * %
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите длину линии");
        int lon = x.nextInt();
        System.out.println("Введите символ");
        String sim = x.next();
        x.close();
        for (int i = 0; i < lon; i++) {
            System.out.println(sim);
        }
    }
}
