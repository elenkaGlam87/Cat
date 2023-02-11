package myfirstobject.abstractfigure;
//прямоугольник

public class Rectangle extends Figure {

    Rectangle (int a, int b) {
        setSide_1(a);
        setSide_2(b);

    }

    @Override
    public double squareFigure() {
        return getSide_1()*getSide_2();
    }

    public String toString () {
        return "Прямоугольник со сторонами: " + getSide_1() + " , " + getSide_2();
    }


}
