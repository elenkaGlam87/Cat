package myfirstobject.device;

public class VacuumCleaner extends Device {
    private String manufacturer;


    public VacuumCleaner(int power, String manufacturer) {
        super(power);
        this.manufacturer=manufacturer;
    }

    @Override
    public void turnOn() {
        System.out.println("Пылесос включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Пылесос выключен");
    }

    public void setManufacturer (String manufacturer) {
        this.manufacturer=manufacturer;
    }

    public String getManufacturer () {
        return manufacturer;
    }

    @Override
    public String toString () {
        return "Производитель пылесоса: " + manufacturer + ", мощность пылесоса: " + getPower();
    }
}
