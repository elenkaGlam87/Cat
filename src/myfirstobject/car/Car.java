package myfirstobject.car;

/**
 * Задание 6.
 * Реализуйте класс «Автомобиль». Необходимо хранить в полях класса: название автомобиля, название производителя,
 * год выпуска, объём двигателя. Реализуйте конструкторы и методы класса для ввода данных, вывода данных, реализуйте
 * доступ к отдельным полям через методы класса. Используйте механизм перегрузки методов.
 */

public class Car {

    String titleCar;
    String titleManufacturer;
    int yearOfRelease;
    double volumeEngine;

    Car() {
    }

    Car (String titleCar, String titleManufacturer, int yearOfRelease, double volumeEngine) {
        this.titleCar=titleCar;
        this.titleManufacturer=titleManufacturer;
        this.yearOfRelease=yearOfRelease;
        this.volumeEngine=volumeEngine;
    }

    void setTitleCar(String titleCar) {
        this.titleCar = titleCar;
    }

    String getTitleCar() {
        return this.titleCar;
    }

    void setTitleManufacturer(String titleManufacturer) {
        this.titleManufacturer = titleManufacturer;
    }

    String getTitleManufacturer() {
        return this.titleManufacturer;
    }

    void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    int getYearOfRelease() {
        return this.yearOfRelease;
    }

    void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    double getVolumeEngine() {
        return this.volumeEngine;
    }

    public String toString() {
        return "Объект Автомобиль имеет поля: Название автомобиля: " + titleCar + " Название производителя: " +
                titleManufacturer + " Год выпуска: " + yearOfRelease + " Объем двигателя: " + volumeEngine;
    }


}
