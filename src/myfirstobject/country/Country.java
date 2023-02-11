package myfirstobject.country;

/**
 * Задание 3.
 * Создайте класс «Страна». Необходимо хранить в полях класса: название страны, название континента,
 * количество жителей в стране, телефонный код страны, название столицы, название городов страны.
 * Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным полям через методы класса.
 */

public class Country {

    String nameCountry;
    String nameContinent;
    int countPeople;
    int phoneCodCountry;
    String capitalName;
    String nameCityCountry;

    Country() {
    }

    Country(String nameCountry, String nameContinent, int countPeople, int phoneCodCountry, String capitalName, String nameCityCountry) {
        this.nameCountry = nameCountry;
        this.nameContinent = nameContinent;
        this.countPeople = countPeople;
        this.phoneCodCountry = phoneCodCountry;
        this.capitalName = capitalName;
        this.nameCityCountry = nameCityCountry;
    }

    Country(String nameContinent, String capitalName) {
        this.nameContinent = nameContinent;
        this.capitalName = capitalName;
    }

    void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    String getNameCountry() {
        return this.nameCountry;
    }

    void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    String getNameContinent() {
        return this.nameContinent;
    }

    void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    int getCountPeople() {
        return this.countPeople;
    }

    void setPhoneCodCountry(int phoneCodCountry) {
        this.phoneCodCountry = phoneCodCountry;
    }

    int getPhoneCodCountry() {
        return this.phoneCodCountry;
    }

    void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    String getCapitalName() {
        return this.capitalName;
    }

    void setNameCityCountry(String nameCityCountry) {
        this.nameCityCountry = nameCityCountry;
    }

    String getNameCityCountry() {
        return this.nameCityCountry;
    }

    @Override
    public String toString() {
        return "Объект страна содержит поля Название страны " + nameCountry + " название континента " + nameContinent +
                " телефонный код " + phoneCodCountry + " Столица " + capitalName;
    }
}
