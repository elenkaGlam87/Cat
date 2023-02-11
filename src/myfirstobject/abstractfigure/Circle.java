package myfirstobject.abstractfigure;
// круг
// S = π × r2

public class Circle extends Figure {
    @Override
    public double squareFigure() {
        return Math.PI*Math.pow(getRadius(),2);
    }
}
