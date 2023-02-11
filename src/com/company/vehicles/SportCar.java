package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int topSpeed;

    public SportCar(String modelCar, String classCar, int weightCar, Driver driver, Engine engine, int topSpeed) {
        super(modelCar, classCar, weightCar, driver, engine);
        this.topSpeed=topSpeed;
    }
}
