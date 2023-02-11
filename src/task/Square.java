package task;

/**
 * Создайте класс для подсчета площади геометрических фигур. Класс должен предоставлять функциональность
 * для подсчета площади треугольника по разным формулам, площади прямоугольника, площади квадрата, площади ромба.
 * Методы класса для подсчета площади должны быть реализованы с помощью статических методов. Также класс должен
 * считать количество подсчетов площади и возвращать это значение с помощью статического метода.
 * S=½bh S = (P⋅a−2⋅a2)/2
 *
 */

public class Square {
    static int count;
    public static void main(String[] args) {
        int length = 8;
        int width = 3;
        int height = 5;

        double squareTriangle = squareTriangle(length, height);
        System.out.println(squareTriangle);
        int squareRectangle1 = squareRectangle1(length, width);
        System.out.println(squareRectangle1);
        int squareRectangle2 = squareRectangle2(length, width);
        System.out.println(squareRectangle2);
        double squareSquare = squareSquare(width);
        System.out.println(squareSquare);
        System.out.println(countSquare(count));
    }

    public static double squareTriangle(int length, int height) {
        count++;
        return (double) 1 / 2 * length * height;
    }

    public static int squareRectangle1(int length, int width) {
        count++;
        return (length * width);
    }
    public static int squareRectangle2 (int length, int width) {
        count++;
        return ((((2*length+2*width)*length)-2*length*length)/2);
    }

    public static double squareSquare (int width) {
        count++;
       return Math.pow(width,2);
    }
    public static int countSquare (int count) {
        return count;
    }
}
