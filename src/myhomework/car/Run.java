package myhomework.car;

public class Run {
    public static void main(String[] args) {
        Engine engine = new Engine("бензин", 2.5, 150);
        Engine engine1 = new Engine("дизель", 2.0, 100);
        Engine engine2 = new Engine("бензин", 3.0, 250);

        Wheel wheel = new Wheel("Пирелли", 16, "летние");
        Wheel wheel1 = new Wheel("Белшина", 14, "зимние");
        Wheel wheel2 = new Wheel("Мишлен", 16, "зимние");

        Car car = new Car("Volvo", 2020, engine, wheel);
        Car car1 = new Car("Opel", 2000, engine1, wheel2);
        Car car2 = new Car("Audi", 2015, engine2, wheel1);

        System.out.println(car.getEngine());
        System.out.println(car1.getWheel().getType());
        System.out.println(car2.getEngine().getVolumeEngine());

        wheel.setType("зимние");
        System.out.println(car.getWheel().getType());


    }
}
