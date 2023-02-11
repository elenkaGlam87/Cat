package simplejava.Dz1;

/**
 * Задание 7
 * Разработать программу, которая позволит при известном
 * годовом проценте вычислить сумму вклада в банке через
 * два года, если задана исходная величина вклада.
 * *
 */
public class Task7 {
    public static void main(String[] args) {

        double stavka = 0.12;
        int vklad = 3000;
        double doxod1 = vklad * stavka;
        double doxod2 = (vklad + doxod1) * stavka;
        double itog = (vklad + doxod1 + doxod2);
        System.out.println("Сумма вклада в банке через два года " + itog);
    }
}
