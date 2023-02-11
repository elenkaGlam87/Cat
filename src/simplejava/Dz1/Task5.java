package simplejava.Dz1;

/**
 * Задание 5
 * Подсчитать площадь и длину окружности для круга с радиусом R. Радиус должен быть задан константой в
 * программе. Вывести результат на консолЬ
 * Формула площади круга через радиус:
 * S = πr2
 *
 * Формула длины окружности через радиус:
 * L = 2πr
 */

public class Task5 {
    public static void main(String[] args) {
        final int R=16;
        final double P=Math.PI;
        double s=P*Math.pow(R,2);
        System.out.println(s);
        System.out.println(2*P*R);
    }
}
