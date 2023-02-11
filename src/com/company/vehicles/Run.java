package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Run {
    public static void main(String[] args) {
        Driver driver = new Driver("Иванов Сергей Петрович", 15);
        Engine engine = new Engine(350, "Toyota");
        Car car = new Car("Rav4", "crossover", 2000, driver, engine);
        System.out.println(car.printInfo());
        Car lorry = new Lorry("Volkswagen", "грузовик", 5000, driver, engine, 2000);
        System.out.println(lorry.printInfo());
    }
}
