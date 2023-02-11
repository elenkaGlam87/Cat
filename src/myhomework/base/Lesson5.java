package myhomework.base;

/**
 * Урок 5. Логические операции.
 *
 * 1) Создайте 3 переменных типа Boolean: true, false, false.
 * 2) Сделайте логические выражения из 3-х переменных, чтобы:
 * А) Обязательно был && и в результате было true (решение в качестве примера:
 * «true && !(false && false)» – только переменные подставляйте, а не значения).
 * Б) Обязательно был || и в результате было false.
 * В) Обязательно был ^ и в результате было true
 */

public class Lesson5 {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        boolean z = false;
        if (x != y && x != z) {
            System.out.println(x);
        }

        if (y!=x || y==z) {
            System.out.println(y);
        }

        boolean a = x^y;
        System.out.println(a);
    }
}
