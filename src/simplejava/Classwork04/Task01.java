package simplejava.Classwork04;

import java.util.Scanner;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры номер месяца (от 1 до 12). В зависимости от полученного номера месяца
 * программа выводит на экран надпись: «Winter» (если введено значение 1,2 или 12),
 * «Spring» (если введено значение от 3 до 5), «Summer» (если введено значение от 6 до 8),
 * «Autumn» (если введено значение от 9 до 11).
 * Если пользователь ввел значение не в диапазоне от 1 до 12 требуется вывести сообщение об ошибке
 */

public class Task01 {
    public static void main(String[] args) {
        int value = inputInf();
        chooseSeason(value);
    }

    public static int inputInf() {
        Scanner r = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int number = r.nextInt();
        r.close();
        return number;
    }

    public static void chooseSeason(int number) {
        switch (number) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Ошибка ввода");
        }
    }
}
