package device;

/**
 * Создать базовый класс «Устройство» и производные классы «Чайник» kettle, «Микроволновка» microwave, «Автомобиль»,
 * «Пароход» steamer. С помощью конструктора установить имя каждого устройства и его характеристики.
 * Реализуйте для каждого из классов методы:
 * ■ Sound — издает звук устройства (пишем текстом в консоль);
 * ■ Show — отображает название устройства;
 * ■ Desc — отображает описание устройства.
 */

public class Device {
    private String name;
    private int power;
    private String sound;

    Device(String name, int power, String sound) {
        this.name = name;
        this.power = power;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Звук устройства " + sound);
    }

    public void showName() {
        System.out.println("Название устройства: " + name);
    }

    public String descDevice() {
        return "class Device содержит поля: name: " + name + " power " + power + " sound " + sound;
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public String getSound() {
        return this.sound;
    }

    public String toString() {
        return "class Device содержит поля: name: " + name + " power " + power + " sound " + sound;
    }


}
