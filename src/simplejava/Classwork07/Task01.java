package simplejava.Classwork07;

/**
 * Задание 1
 * Пользователь вводит с клавиатуры строку. Произведите поворот строк и полученный результат выведите
 * на экран.
 */

public class Task01 {
    public static void main(String[] args) {
        String stroka = "hello";
        char[] mas = stroka.toCharArray();
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i]);
        }

    }
}
