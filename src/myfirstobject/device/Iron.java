package myfirstobject.device;

public class Iron extends Device{
    private int surface;

    public Iron(int power, int surface) {
        super(power);
        this.surface=surface;
    }

    @Override
    public void turnOn() {
        System.out.println("Утюг включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Утюг выключен");
    }

    public void done () {
        System.out.println("Я поутюжил");
    }
    public void setSurface (int surface) {
        this.surface=surface;
    }
    public int getSurface () {
        return surface;
    }

    public String toString () {
        return "Утюг мощностью: " + getPower() + ", площадью поверхности:" + surface;
    }
}
