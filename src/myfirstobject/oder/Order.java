package myfirstobject.oder;

/**
 * Вариант 2). Система управления доставкой товара.
 * Order - заявка:
 * Свойства:
 * Конструктор  	{ - id – идентификатор;
 * - name – название товара;
 * - courier – курьер (ответственный за доставку); }
 * - dateTime – дата и время (String);
 * - type – тип заказа (1 – срочный заказ; 2 – обычный заказ).
 */

public class Order {
    private int id;
    private String name;
    private String courier;
    private String dateTime;
    private String type;

    public Order(int id, String name, String courier) {
        this.id = id;
        this.name = name;
        this.courier = courier;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourier() {
        return courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getType() {
        return type;
    }

    public String toString () {
        return "Класс Заявка содержит информацию: \n Идентификатор: " + id + "\n Название товара: " + name +
                "\n Курьер (ответственный за доставку): " + courier + "\n Дата и время: " + dateTime + "\n Тип заказа: " + type;
    }
}
