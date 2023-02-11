package task;

/**
 * Написать метод, который будет считать общее количество знаков препинания в String.
 */

public class Lesson4 {
    public static void main(String[] args) {
        String poem = "Я помню чудное мгновенье, передо мной явилась ты! Как мимолетное виденье, " +
                "как гений чистой красоты!";
        char[] poemNew = poem.toCharArray();
        System.out.println(countSymbol(poemNew));

    }

    public static int countSymbol (char[] poemNew) {
        int count=0;
        for (char c : poemNew) {
            if (c == ',' || c == '.' || c == '!' || c == '?') {
                count++;
            }
        }
        return count;
    }
}
