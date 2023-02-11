package myfirstobject.fraction;

/**
 * Задание 4.
 * Создайте класс Дробь. Необходимо хранить в полях класса: числитель и знаменатель. Реализуйте методы класса
 * для ввода данных, вывода данных, реализуйте доступ к отдельным полям через методы класса. Также создайте
 * методы класса для выполнения арифметических операций (сложение, вычитание, умножение, деление, и т.д.).
 */

public class Fraction {

    int numerator;
    int denominator;

    Fraction () {

    }

    Fraction (int numerator, int denominator) {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    Fraction (int numerator) {
        this.numerator=numerator;
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    int getNumerator() {
        return this.numerator;
    }

    void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    int getDenominator () {
        return this.denominator;
    }

    @Override
    public String toString() {
        return "класс Дробь содержит поля: Числитель " + numerator + " Знаменатель " + denominator ;
    }

    public static void sumNumber(int numerator, int denominator) {
        System.out.println("Сложение " + (numerator+denominator));
    }

    public static void subtractionNumber (int numeration, int denominator) {
        System.out.println("Вычитание " + (numeration-denominator));
    }

    public static void multiplicationNumber (int numerator, int denominator) {
        System.out.println("Умножение " + (numerator*denominator));
    }

    public static void divisionNumber (int numerator, int denominator) {
        System.out.println("Деление " + (numerator/denominator));
    }


}
