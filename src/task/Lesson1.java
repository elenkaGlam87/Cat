package task;

import java.util.Arrays;

/**
 * Заменить все грустные смайлы в строке на веселые.
 */

public class Lesson1 {
    public static void main(String[] args) {
        String smile = "((((((";
        System.out.println(smile);
        String goodSmile = smile.replace('(', ')');
        System.out.println(goodSmile);
    }
}
