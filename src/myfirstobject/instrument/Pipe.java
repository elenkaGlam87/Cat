package myfirstobject.instrument;
// труба
public class Pipe implements Instrument {
    private int diameter;

    public Pipe (int diameter) {
        this.diameter=diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + getDiameter());
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
