package simplejava.Cw4;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры целое шестизначное число. Написать программу, которая определяет,
 * является ли введенное число — счастливым (Счастливым считается шестизначное число, у которого сумма первых
 * 3 цифр равна сумме вторых трех цифр).
 * Например, 123321 — счастливое число, так как 1 + 2 + 3 = 3 + 2 + 1.
 * С другой стороны 378423 несчастливое число, так как 3 + 7 + 8 ! = 4 + 2 + 3.
 * Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке
 */

public class Task1 {
    public static void main(String[] args) {
        /*Scanner num = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        int chis = num.nextInt();
        num.close();
        int num_1 = chis % 10;
        int num_2 = (chis / 10) % 10;
        int num_3 = (chis / 100) % 10;
        int num_4 = (chis / 1000) % 10;
        int num_5 = (chis / 10000) % 10;
        int num_6 = (chis / 100000) % 10;
        if ((num_6 + num_5 + num_4) == (num_3 + num_2 + num_1)) {
            System.out.println(chis + " Счастливое число");
        } else if ((num_6 + num_5 + num_4) != (num_3 + num_2 + num_1)) {
            System.out.println(chis + " Несчастливое число");
        }*/

        String x = "Hello";
        System.out.println(x.length());

    }
}
