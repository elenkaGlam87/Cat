package simplejava.Dz1;

public class Lesson1 {

    public static void main(String[] args) {

        byte a = 12;
        short b = 6;
        int c = 8;
        long d = 4;
        float e;
        double t;
        boolean p;

        e = 7.6f;
        t = 5.2;

        p = (c > a);

        int f = (int) (a + b + c + d);
        System.out.println(f);

        if (a > c) {
            System.out.println("да");

        } else {
            System.out.println("нет");
        }

    }
}