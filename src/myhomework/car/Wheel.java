package myhomework.car;

public class Wheel {

    private String name;
    private int radius;
    private String type;

    public Wheel(String name, int radius, String type) {
        this.name = name;
        this.radius = radius;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "Класс Wheel включает поля: Название: " + name + " Радиус: " + radius + " Тип: " + type;
    }

}
