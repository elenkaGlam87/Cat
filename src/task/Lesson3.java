package task;

/**
 * Написать функцию, принимающую в качестве параметров Фамилию, имя и отчество и возвращающую инициалы в формате
 * Ф. И. О. Необходимо учесть, что входные параметры могут быть в любом регистре, а результирующая строка только
 * в верхнем.
 */

public class Lesson3 {
    public static void main(String[] args) {
        String lastName = "Гусакова";
        String firstName = "Елена";
        String secondName = "олеговна";
        System.out.println(init(lastName, firstName, secondName));
    }

    public static String init(String lastname, String firstname, String secondName) {
        char num1 = lastname.charAt(0);
        char num2 = firstname.charAt(0);
        char num3 = secondName.charAt(0);
        return String.format(" %s.%s. %s.", num1, num2, num3).toUpperCase();
    }
}
