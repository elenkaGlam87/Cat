package simplejava.Dz1;

/**
 * Задание 6
 * Есть прямоугольник, у которого известна ширина w и высота h. Найти и вывести на консоль периметр и площадь
 * заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
 * программы *
 * P=2(a+b) периметр
 * S=a*b площадь
 */

public class Task6 {
    public static void main(String[] args) {
        final int W = 5;
        final int H = 8;
        System.out.println("Периметр прямоугольника равен: " + (2*(W+H)));
        System.out.println("Площадь прямоугольника равна: " + (W*H));

    }
}
