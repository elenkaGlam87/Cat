package myfirstobject.calculator;

public class Run {
    public static void main(String[] args) {
        int num1=Calculator.getInt();
        int num2=Calculator.getInt();

        System.out.println(Calculator.calc(num1,num2,Calculator.getOperation()));

    }
}
