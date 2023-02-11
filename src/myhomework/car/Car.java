package myhomework.car;

public class Car {
    private String nameCar;
    private int year;
    private Engine engine;
    private Wheel wheel;

    public Car (String nameCar, int year, Engine engine, Wheel wheel) {
        this.nameCar=nameCar;
        this.year=year;
        this.engine=engine;
        this.wheel=wheel;
    }
    public void setNameCar (String nameCar) {
        this.nameCar=nameCar;
    }
    public String getNameCar () {
        return this.nameCar;
    }
    public void setYear (int year) {
        this.year=year;
    }
    public int getYear () {
        return this.year;
    }
    public void setEngine (Engine engine) {
        this.engine=engine;
    }
    public Engine getEngine () {
        return this.engine;
    }
    public void setWheel (Wheel wheel) {
        this.wheel=wheel;
    }
    public Wheel getWheel () {
        return this.wheel;
    }

    public String toString () {
        return " Класс Автомобиль содержит поля: Название автомобиля - " + nameCar + " Год - " + year +
                " Двигатель - " + engine + " Колеса - " + wheel;
    }
}
