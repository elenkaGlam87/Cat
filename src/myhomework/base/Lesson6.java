package myhomework.base;

/**
 * Урок 6. Битовые операции.
 *
 * Создайте две целых переменных (5 и 10).
 * Преобразуйте их в двоичный код и выведите их.
 * Выполните между ними следующие операции: &, |, ^.
 * С первой переменной сделайте ещё так же следующие операции: ~, >>1, <<1.
 * Примечание: перед просмотром результатов побитовых операций обязательно рассчитайте его самостоятельно,
 * а потом просто сравните с правильным.
 */

public class Lesson6 {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;

        System.out.println("Переменная " + value1 + " в двоичном коде " + Integer.toBinaryString(value1));

        System.out.println("Переменная " + value2 + " в двоичном коде " + Integer.toBinaryString(value2));

        System.out.println(value1 + " & " + value2 + " result in binary string "
                + Integer.toBinaryString((value1 & value2)));
        System.out.println(value1 + " | " + value2 + " result in binary string "
                + Integer.toBinaryString((value1 | value2)));
        System.out.println(value1 + " ^ " + value2 + " result in binary string "
                + Integer.toBinaryString((value1 ^ value2)));

        System.out.println("Переменная " + " ~ " + value1 + " result in binary string "
                + Integer.toBinaryString((~value1)));
        System.out.println("Переменная " + value1 + " >>1 " + " result in binary string "
                + Integer.toBinaryString((value1 >> 1)));
        System.out.println("Переменная " + value1 + " <<1 " + " result in binary string "
                + Integer.toBinaryString((value1 << 1)));
    }
}

