package myfirstobject.instrument;

public class Runner {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(7);
        Guitar guitar2 = new Guitar(6);
        Drum drum1 = new Drum(15);
        Drum drum2 = new Drum(20);
        Pipe pipe1 = new Pipe(10);
        Pipe pipe2 = new Pipe(18);

        Instrument[] instruments = {guitar1, guitar2, drum1, drum2, pipe1, pipe2};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
