package myfirstobject.device;

/**
 Создать суперкласс (Device) и дочерние классы (пылесос, компьютер, утюг, телевизор) с методами turnOn() и turnOff() в котором будет
 выводиться на экран надпись, что работает и как работает И как выключилось. (Например: Пылесос включен. Засасывает пыль.)
 */

public abstract class Device {
    private int power;

    public Device (int power) {
        this.power=power;
    }
    public abstract void turnOn ();
    public abstract void turnOff();

    public void setPower (int power) {
        this.power=power;
    }

    public int getPower () {
        return power;
    }


    }



