package myfirstobject.animal;

import task.Lesson5;

public class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот замяукал");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест мышку");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void liveIn(Animal animal) {
        System.out.println("Cat sleeps in my house");
    }
}
