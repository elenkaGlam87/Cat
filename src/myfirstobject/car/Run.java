package myfirstobject.car;

public class Run {
    public static void main(String[] args) {

        Car car = new Car();

        car.setTitleCar("Toyota Camry");
        car.setTitleManufacturer("Toyota");
        car.setYearOfRelease(2020);
        car.setVolumeEngine(2.0);

        System.out.println(car.getTitleCar());
        System.out.println(car.getTitleManufacturer());
        System.out.println(car.getYearOfRelease());
        System.out.println(car.getVolumeEngine());

        System.out.println();

        System.out.println(car);

        Car car1 = new Car("Opel Astra J", "Opel", 2021, 1.6);
        System.out.println(car1);
    }
}
