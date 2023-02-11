package simplejava.Classwork04;

import java.util.Scanner;

/**
 * Задание 4
 * Вам необходимо модифицировать задание 3. Теперь вместо названия поры года, нужно выводить название месяца.
 */

public class Task02 {
    public static void main(String[] args) {
        int value = inputNumber();
        String month=null;
        String season = chooseSeason(value, month);
    }

    public static int inputNumber() {
        Scanner e = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int number = e.nextInt();
        e.close();
        return number;
    }

    public static String chooseSeason(int value, String month) {

        switch (value) {
            case 1:
                month = "январь";
                break;
            case 2:
                month = "февраль";
                break;
            case 3:
                month = "март";
                break;
            case 4:
                month = "апрель";
                break;
            case 5:
                month = "май";
                break;
            case 6:
                month = "июнь";
                break;
            case 7:
                month = "июль";
                break;
            case 8:
                month = "август";
                break;
            case 9:
                month = "сентябрь";
                break;
            case 10:
                month = "октябрь";
                break;
            case 11:
                month = "ноябрь";
                break;
            case 12:
                month = "декабрь";
                break;
            default:
                month = "ошибка ввода";
        }
        System.out.println(month);
        return month;
    }
}
