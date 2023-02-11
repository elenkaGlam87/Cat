package myfirstobject.calculatorobject;

public class Calculator {
    private final int num1;
    private final int num2;
    private final char operation;

    Calculator(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperation() {
        return operation;
    }

    public int calc(int num1, int num2, char operation) {
        if (operation == '+') {
            return num1 + num2;
        } else if (operation == '-') {
            return num1 - num2;
        } else if (operation == '*') {
            return num1 * num2;
        } else if (operation == '/' && num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("деление на 0 запрещено");
            return 0;
        }
    }
}
