package myfirstobject.country;

import java.util.concurrent.Callable;

public class Run {
    public static void main(String[] args) {

        Country country = new Country();

        country.setNameCountry("Canada");
        country.setNameContinent("North America");
        country.setCountPeople(125789);
        country.setPhoneCodCountry(957);
        country.setCapitalName("Ottawa");
        country.setNameCityCountry("Toronto, Montreal, Winnipeg");

        System.out.println(country.getNameCountry());
        System.out.println(country.getNameContinent());
        System.out.println(country.getCountPeople());
        System.out.println(country.getPhoneCodCountry());
        System.out.println(country.getCapitalName());
        System.out.println(country.getNameCityCountry());

        System.out.println();

        System.out.println(country);
        System.out.println();

        Country country1 = new Country("Africa", "Egypt", 2564, 568, "Kair",
                "Luxcor, Doha");
        System.out.println(country1);

        Country country2 = new Country("Европа", "Мадрид");
        System.out.println(country2);
    }
}
