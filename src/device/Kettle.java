package device;

public class Kettle extends Device {
    private int volume;

    Kettle(String name, int power, String sound, int volume) {
        super(name, power, sound);
        this.volume=volume;
    }



}
