package myhomework.base;

/**
 * Урок 3. Арифметические операции.
 * Создайте две переменные типа double и присвойте им какие-нибудь значения.
 * Выполните с ними операции сложения, вычитания, умножения и деления.
 * Выполните операцию инкремента и декремента над одной из переменных. Выведите результат в консоль.
 * Прибавьте к первой переменной 5 и запишите результат в эту же переменную (полной записью и сокращённой).
 * Выведите результат в консоль.
 * Создайте целую переменную и присвойте ей значение 8. Выведите остаток от деления на 3 в консоль.
 */

public class Lesson3 {
    public static void main(String[] args) {
        double value1 = 2.5;
        double value2 = 5.5;

        System.out.println("Сумма: " + (value1+value2));
        System.out.println("Разность: " + (value1-value2));
        System.out.println("Произведение: " + (value1*value2));
        System.out.println("Деление: " + (value1/value2));

        value1++;
        System.out.println("Операция инкремента " + value1);

        value1--;
        System.out.println("Операция декремента " + value1);

        value1=value1+5;
        System.out.println(value1);
        value1+=5;
        System.out.println(value1);

        int variable = 8;
        System.out.println("Остаток от деления на 3: " + (variable%3));
    }
}
