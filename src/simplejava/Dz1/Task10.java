package simplejava.Dz1;

/**
 * Задание 10
 * Написать программу расчета идеального веса к росту. В
 * константах хранятся рост (height) и вес (weight). Вывести на
 * консоль сообщение, сколько килограмм нужно набрать или
 * сбросить (идеальный вес = рост - 110)
 */
public class Task10 {
    public static void main(String[] args) {
        final int HEIGHT = 180;
        final int WEIGHT = 100;
        int ideal = HEIGHT - 110;
        if (WEIGHT > ideal) {
            System.out.println("Нужно сбросить " + (WEIGHT - ideal) + " кг");
        } else if (WEIGHT < ideal) {
            System.out.println("Нужно набрать " + (ideal - WEIGHT) + " кг ");
        } else {
            System.out.println("Ваш вес идеальный");
        }

    }
}
