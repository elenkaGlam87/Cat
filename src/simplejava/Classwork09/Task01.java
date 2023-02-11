package simplejava.Classwork09;

/**
 * Задание 1
 * Напишите метод, который отображает на экран форматированный текст, указанный ниже
 * “Someone’s sitting in the shade today
 * because someone planted a tree a long time ago.”
 * Warren Buffet.
 */

public class Task01 {
    public static void main(String[] args) {
        inputText();
    }

    public static void inputText() {
        String a1 = "\"Someone's sitting in the shade today";
        String a2 = "because someone planted a tree a long time ago.\" ";
        String a3 = "Warren Buffet.";
        System.out.print(a1 + "\n" + a2 + "\n" + a3);
    }
}
