package myfirstobject.calculatorobject;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(8, 5,'+');
        System.out.println(calculator.calc(calculator.getNum1(),calculator.getNum2(), calculator.getOperation()));
    }
}
