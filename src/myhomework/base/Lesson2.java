package myhomework.base;

/**
 * Урок 2. Переменные и их типы.
 *
 * Создайте строковую переменную со значением: «53.5»
 * Преобразуйте эту строковую переменную в переменную типа double. Выведите получившуюся переменную в консоль.
 * Создайте переменную типа char, в которую поместите первую букву Вашего имени. Выведите её в консоль.
 * Создайте целую переменную с именем age и присвойте ей значение Вашего возраста. Выведите её в консоль.
 */

public class Lesson2 {
    public static void main(String[] args) {
        String value = "53.5";
        Double newValue = Double.valueOf(value);
        System.out.println(newValue);

        char valueName = 'L';
        System.out.println(valueName);

        int age = 34;
        System.out.println(age);
    }
}
