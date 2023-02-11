package myhomework.car;

public class Engine {
    private String typeOfEngine;
    private double volumeEngine;
    private int power;

    public Engine(String typeOfEngine, double volumeEngine, int power) {
        this.typeOfEngine = typeOfEngine;
        this.volumeEngine = volumeEngine;
        this.power = power;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfEngine() {
        return this.typeOfEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public double getVolumeEngine() {
        return this.volumeEngine;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String toString() {
        return " Класс Двигатель имеет поля: Тип: " + typeOfEngine + " Объём: " + volumeEngine + " Мощность: "
                + power;
    }
}
