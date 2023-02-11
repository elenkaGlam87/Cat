package com.company.details;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "мощность мотора: " + power + "\n производитель: " + manufacturer;
    }
}
