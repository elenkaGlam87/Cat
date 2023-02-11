package myfirstobject.abstractfigure;
// трапеция
// S=½h(a+b)

public class Trapezoid extends Figure {
    @Override
    public double squareFigure() {
        return 0.5*getFooting()*(getSide_1()+getSide_2());
    }
}
