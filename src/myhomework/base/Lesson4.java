package myhomework.base;

/**
 * Урок 4. Операции сравнения.
 * Создайте 2 переменных типа double с произвольными значениями.
 * Выведите в консоль следующие операции сравнения между ними: >, <, >=, <=, !=, ==
 */

public class Lesson4 {
    public static void main(String[] args) {
        double num1 = 4.3;
        double num2 = 8.1;
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1!=num2);
        System.out.println(num1==num2);
    }
}
