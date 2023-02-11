package task;

import java.util.Locale;

/**
 * Написать функцию, принимающую 2 параметра: строку и слово, и возвращающую true, если строка начинается и
 * заканчивается этим словом.
 */

public class Lesson2 {
    public static void main(String[] args) {
        String str = "Java - лучший язык программирования. Да здравствует Java";
        String word = "Java";
        System.out.println(isStart(str, word));
    }

    public static boolean isStart(String str, String word) {
        return str.toLowerCase().startsWith(word.toLowerCase()) && str.toLowerCase().endsWith(word.toLowerCase());
    }
}
