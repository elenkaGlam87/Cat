package myfirstobject.contact;

/**
 * Создать программу на языке Java для определения класса в некоторой предметной области.
 * Описать состояние, конструктор, методы геттеры/сеттеры, переопределить метод toString() для вывода полной информации
 * об объекте в отформатированном виде: Записная книжка контактов.
 * Contact – запись информации о контакте в записную книжку.
 * Свойства: - id – идентификатор контакта;
 *  Конструктор 	{
 * - firstName – имя;
 * - lastName –фамилия;
 * - address –адрес; }
 * - phone –телефон;
 * - note – запись о контакте.
 */

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String note;

    public Contact (String firstName, String lastName, String address) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getNote() {
        return note;
    }

    public String toString () {
        return "Класс Контакт содержит информацию о контакте в записной книжке: идентификатор контакта - " + id +
                ", имя - " + firstName + ", фамилия - " + lastName + ", адрес - " + address + ", телефон - " + phone +
                ", запись о контакте - " + note;
    }
}
