package myfirstobject.animal;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */

public class Animal {
    private String food;
    private String location;

    public Animal (String food, String location) {
        this.food=food;
        this.location=location;
    }
    public void liveIn (Animal animal) {
        if (animal instanceof Cat || animal instanceof Dog || animal instanceof Horse) {
            System.out.println("sleeps in my house");
        }
    }
    public void makeNoise() {
        System.out.println("Животное шумит");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
