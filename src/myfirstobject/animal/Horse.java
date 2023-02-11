package myfirstobject.animal;

public class Horse extends Animal {
    private int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed=speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь заржала");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь есть овёс");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void liveIn(Animal animal) {
        System.out.println("Horse sleeps in my barn");
    }
}
