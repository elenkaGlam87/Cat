package myfirstobject.abstractfigure;

/**
 * Создайте абстрактный базовый класс Фигура с абстрактным методом для подсчета площади. Создайте производные
 * классы: прямоугольник, круг, прямоугольный треугольник, трапеция со своими реализациями метода для подсчета площади.
 * Для проверки определите массив ссылок на абстрактный класс, которым присваиваются адреса различных объектов
 * классов-потомков.
 */

public abstract class Figure {
    private int side_1;
    private int side_2;
    private int footing;
    private int radius;

    public abstract double squareFigure();

    public void setSide_1 (int side_1) {
        this.side_1=side_1;
    }

    public int getSide_1() {
        return side_1;
    }

    public void setSide_2 (int side_2) {
        this.side_2=side_2;
    }

    public int getSide_2() {
        return side_2;
    }

    public int getFooting() {
        return footing;
    }

    public int getRadius() {
        return radius;
    }
}
