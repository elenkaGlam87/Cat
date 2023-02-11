package myfirstobject.human;

/**
 * Задание 1.
 * Реализуйте класс «Человек». Необходимо хранить в полях класса: ФИО, дату рождения, контактный телефон, город,
 * страну, домашний адрес. Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным
 * полям через методы класса
 */

public class Human {

    String firstName;
    String lastName;
    String birthday;
    String telephoneNumber;
    String city;
    String country;
    String address;

    Human() {
    }

    Human(String firstName, String lastName, String birthday, String telephoneNumber, String city, String country,
          String address) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthday=birthday;
        this.telephoneNumber=telephoneNumber;
        this.city=city;
        this.country=country;
        this.address=address;
    }

    Human (String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return this.firstName;
    }

    void setLastName(String surname) {
        lastName = surname;
    }

    String getLastName() {
        return this.lastName;
    }

    void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    String getBirthday() {
        return this.birthday;
    }

    void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getCity() {
        return this.city;
    }

    void setCountry(String country) {
        this.country = country;
    }

    String getCountry() {
        return this.country;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Объект Человек содержит поля: имя - " + firstName + " фамилия " + lastName + " дата рождения " + birthday;
    }


}
