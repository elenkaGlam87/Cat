package myfirstobject.abstractfigure;
// прямоугольный треугольник
// S = 1/2 (a × b), где a и b — катеты

public class RightTriangle extends Figure {
    @Override
    public double squareFigure() {
        return (0.5*(getSide_1()*getSide_2()));
    }
}
