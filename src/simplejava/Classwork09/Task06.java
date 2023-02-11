package simplejava.Classwork09;

/**
 * Задание 6
 * Напишите метод, который проверяет является ли число простым. Число передаётся в качестве параметра.
 * Если число простое нужно вернуть из метода true, иначе false
 */

public class Task06 {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(simpleNumber(number));
    }

    public static boolean simpleNumber(int number) {
        boolean num;
        if (number % 1 == 0 && number % 1 == 0 && number % 2 != 0 && number % 3 != 0) {
            num = true;
        } else if (number == 2 || number == 3) {
            num = true;
        } else num = false;
        return num;
    }
}
