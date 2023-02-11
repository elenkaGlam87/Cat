package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String modelCar;
    private String classCar;
    private int weightCar;
    private Driver driver;
    private Engine engine;

    public Car(String modelCar, String classCar, int weightCar, Driver driver, Engine engine) {
        this.modelCar = modelCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String printInfo() {
        return "Автомобиль модели: " + modelCar + ", класс: " + classCar + ", вес автомобиля: " + weightCar +
                "\n водитель: " + driver + "\n мотор автомобиля: " + engine;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public void setWeightCar(int weightCar) {
        this.weightCar = weightCar;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModelCar() {
        return modelCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public int getWeightCar() {
        return weightCar;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }
}
