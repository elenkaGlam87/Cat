package myfirstobject.instrument;
// барабан
public class Drum implements Instrument {
    private int size;

    public Drum (int size) {
        this.size=size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + getSize());
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
