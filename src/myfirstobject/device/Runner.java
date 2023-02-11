package myfirstobject.device;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Device vacuumCleaner = new VacuumCleaner(2500, "Samsung");
        Iron iron = new Iron(500, 150);
        Device computer = new Computer(1000, "Intel");
        human.turnOnDevice(computer);
        human.turnOffDevice(iron);

        System.out.println(vacuumCleaner.toString());
        iron.done();
    }
}
