package myfirstobject.phone;

/**
 * Класс Phone.
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса (заполнить данными).
 * в) Выведите на консоль значения их переменных.
 * г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 */

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall (String nameCaller) {
        System.out.println("Звонит " + nameCaller);
    }


    public String getNumber(String numberCaller) {
        return numberCaller;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Класс Phone содержит параметры: номер - " + number + ", модель - " + model + ", масса - " + weight;
    }
}
