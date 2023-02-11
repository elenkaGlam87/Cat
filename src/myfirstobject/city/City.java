package myfirstobject.city;

/**
 * Задание 2.
 * Создайте класс «Город». Необходимо хранить в полях класса: название города, название региона, название
 * страны, количество жителей в городе, почтовый индекс города, телефонный код города.
 * Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным полям через методы класса.
 */

public class City {

    String nameCity;
    String regionCity;
    String nameCountry;
    int countPopulation;
    int zipCod;
    int phoneCod;

    City() {

    }

    City (String nameCity, String regionCity, String nameCountry, int countPopulation, int zipCod, int phoneCod) {
        this.nameCity=nameCity;
        this.regionCity=regionCity;
        this.nameCountry=nameCountry;
        this.countPopulation=countPopulation;
        this.zipCod=zipCod;
        this.phoneCod=phoneCod;
    }

    City (String nameCity, String nameCountry) {
        this.nameCity=nameCity;
        this.nameCountry=nameCountry;
    }

    void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    String getNameCity() {
        return this.nameCity;
    }

    void setRegionCity(String regionCity) {
        this.regionCity = regionCity;
    }

    String getRegionCity() {
        return this.regionCity;
    }

    void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    String getNameCountry() {
        return this.nameCountry;
    }

    void setCountPopulation(int countPopulation) {
        this.countPopulation = countPopulation;
    }

    int getCountPopulation() {
        return this.countPopulation;
    }

    void setZipCod(int zipCod) {
        this.zipCod = zipCod;
    }

    int getZipCod() {
        return this.zipCod;
    }

    void setPhoneCod(int phoneCod) {
        this.phoneCod = phoneCod;
    }

    int getPhoneCod() {
        return this.phoneCod;
    }

    @Override
    public String toString() {
        return "Объект Город имеет название " + nameCity + " регион города " + regionCity + " название страны " + nameCountry;
    }
}
