package myfirstobject.animal;

public class Dog extends Animal {
    private int height;

    public Dog(String food, String location, int height) {
        super(food, location);
        this.height=height;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака залаяла");
    }

    @Override
    public void eat() {
        System.out.println("Собака есть мясо");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void liveIn(Animal animal) {
        System.out.println("Dog sleeps in my house");
    }
}
