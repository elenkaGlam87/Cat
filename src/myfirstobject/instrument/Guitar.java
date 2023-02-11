package myfirstobject.instrument;

public class Guitar implements Instrument {
    private int countStrings;

    public Guitar(int countStrings) {
        this.countStrings = countStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн" + getCountStrings() + ". Играет нота " + Instrument.KEY);
    }

    public void setCountStrings(int countStrings) {
        this.countStrings = countStrings;
    }

    public int getCountStrings() {
        return countStrings;
    }
}
