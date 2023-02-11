package task;

/**
 * Создайте класс для подсчета максимума из четырех аргументов, минимума из четырех аргументов,
 * среднеарифметического из четырех аргументов, факториала аргумента. Функциональность надо реализовать в виде
 * статических методов
 */

public class Lesson5 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 4;
        int num4 = 7;
        System.out.println("Максимум из четырех аргументов: " + maxVariable(num1, num2, num3, num4));
        System.out.println("Минимум из четырех аргументов: " + minVariable(num1, num2, num3, num4));
        System.out.println("Среднеарифметическое из четырех аргументов: " + arithmeticMean(num1, num2, num3, num4));
        System.out.println("Факториал аргумента " + num2 + " равен: " + factorialVariable(num2));

    }

    public static int maxVariable(int num1, int num2, int num3, int num4) {
        return Math.max((Math.max(num1, num2)), (Math.max(num3, num4)));
    }

    public static int minVariable(int num1, int num2, int num3, int num4) {
        return Math.min((Math.min(num1, num2)), (Math.min(num3, num4)));
    }

    public static int arithmeticMean(int num1, int num2, int num3, int num4) {
        return (num1 + num2 + num3 + num4) / 4;
    }

    public static int factorialVariable(int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * i;
        }
        return result;
    }
}
