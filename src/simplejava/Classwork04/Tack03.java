package simplejava.Classwork04;

import java.util.Scanner;

/**
 * Задание 5
 * Пользователь вводит с клавиатуры число в диапазоне от 1 до 100.
 * Если число кратно 3 (делится на 3 без остатка) нужно вывести слово «Fizz».
 * Если число кратно 5 нужно вывести слово «Buzz».
 * Если число кратно 3 и 5 нужно вывести «Fizz Buzz».
 * Если число не кратно не 3 и 5 нужно вывести само число.
 * Если пользователь ввел значение не в диапазоне от 1 до 100 требуется вывести сообщение об ошибке
 */

public class Tack03 {
    public static void main(String[] args) {
        int x = inputNumber();
        chooseNumber(x);
    }

    public static int inputNumber() {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите число");
        int x = k.nextInt();
        return x;
    }

    public static void chooseNumber(int x) {
        if (x >= 1 && x <= 100) {
            if (x % 3 == 0 && x % 5 != 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0 && x % 3 != 0) {
                System.out.println("Buzz");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (x % 3 != 0 && x % 5 != 0) {
                System.out.println(x);
            }
        } else System.out.println("Ошибка ввода");
    }
}
