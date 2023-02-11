package myfirstobject.fraction;

import static myfirstobject.fraction.Fraction.divisionNumber;
import static myfirstobject.fraction.Fraction.multiplicationNumber;
import static myfirstobject.fraction.Fraction.subtractionNumber;
import static myfirstobject.fraction.Fraction.sumNumber;

public class Run {
    public static void main(String[] args) {

        Fraction fraction = new Fraction();

        fraction.setNumerator(10);
        fraction.setDenominator(2);

        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());

        System.out.println();

        System.out.println(fraction);

        sumNumber(fraction.numerator, fraction.denominator);
        subtractionNumber(fraction.numerator, fraction.denominator);
        multiplicationNumber(fraction.numerator, fraction.denominator);
        divisionNumber(fraction.numerator, fraction.denominator);

        System.out.println();

        Fraction fraction1 = new Fraction(18, 6);
        System.out.println(fraction1);

        Fraction fraction2 = new Fraction(48);
        System.out.println(fraction2);
    }
}

