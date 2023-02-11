package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int bodyLoadCapacity;
    public Lorry(String modelCar, String classCar, int weightCar, Driver driver, Engine engine, int bodyLoadCapacity) {
        super(modelCar, classCar, weightCar, driver, engine);
        this.bodyLoadCapacity=bodyLoadCapacity;
    }
}
