package simplejava.Cw1;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел, разницу чисел, произведение
 * чисел. Результат вычислений вывести на экран.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = in.nextInt();
        System.out.println("Введите второе число");
        int y = in.nextInt();
        in.close();
        int sum = x + y;
        int raz = x - y;
        int proizv = x * y;
        System.out.printf("Сумма чисел %d и %d равна %d \n", x, y, sum);

        System.out.printf("Разность чисел %d и %d равна %d \n", x, y, raz);

        System.out.printf("Произведение чисел %d и %d равно %d \n", x, y, proizv);

    }

}
