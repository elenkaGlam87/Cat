package device;

public class Microwave extends Device {
    Microwave(String name, int power, String sound) {
        super(name, power, sound);
    }
    @Override
    public String descDevice() {
        return "class Microwave содержит поля: name: " + getName() + " power " + getPower() + " sound " + getSound();
    }
    public String weight () {
        return "152";
    }

}
