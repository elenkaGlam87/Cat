package simplejava.Classwork09;

/**
 * Задание 7
 * Напишите метод, который проверяет является ли шестизначное число «счастливым».
 * Число передаётся в качестве параметра. Если число счастливое нужно вернуть из метода true, иначе false.
 * «Счастливое шестизначное число» — это число у которого сумма первых трёх цифр равна сумме трёх вторых цифр.
 * Например, 123420 — счастливое 1+2+3 = 4+2+0, а 723422 — несчастливое 7+2+3 != 4+2+2
 */

public class Task07 {
    public static void main(String[] args) {
        int number = 123420;
        System.out.println(luckyNumber(number));
    }

    public static boolean luckyNumber(int number) {

        boolean num;
        int num6 = number % 10;
        int num5 = (number / 10) % 10;
        int num4 = (number / 100) % 10;
        int num3 = (number / 1000) % 10;
        int num2 = (number / 10000) % 10;
        int num1 = (number / 100000) % 10;
        if (num1 + num2 + num3 == num4 + num5 + num6) {
            num = true;
        } else num = false;
        return num;
    }
}
