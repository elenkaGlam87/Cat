package simplejava.Classwork09;

/**
 * Задание 3
 * Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
 * Метод принимает в качестве параметра: длину линии, направление, символ
 */

public class Task03 {
    public static void main(String[] args) {
        int lengthLine = 10;
        String symbolLine = "&";
        String directionLine = "horizontal";
        paintingLine(lengthLine, symbolLine, directionLine);
    }

    public static void paintingLine(int lengthLine, String symbolLine, String directionLine) {
        for (int i = 0; i < lengthLine; i++) {
            if (directionLine == "horizontal") {
                for (int j = 0; j < lengthLine; j++) {
                    System.out.print(symbolLine);
                }
                break;
            } else if (directionLine == "vertical")
                System.out.println(symbolLine);
        }
    }
}
