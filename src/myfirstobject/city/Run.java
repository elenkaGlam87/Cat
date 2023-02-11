package myfirstobject.city;

public class Run {
    public static void main(String[] args) {
        City city = new City();
        city.setNameCity("Vitebsk");
        city.setRegionCity("Pervomajski");
        city.setNameCountry("Republic of Belarus");
        city.setCountPopulation(450000);
        city.setZipCod(210000);
        city.setPhoneCod(80212);

        System.out.println(city.getNameCity());
        System.out.println(city.getRegionCity());
        System.out.println(city.getNameCountry());
        System.out.println(city.getCountPopulation());
        System.out.println(city.getZipCod());
        System.out.println(city.getPhoneCod());

        System.out.println();

        System.out.println(city);
        System.out.println();

        City city1 = new City("Moskow", "Arbat", "Russia", 2000, 567,
                60);
        System.out.println(city1);

        City city2 = new City("Paris", "France");
        System.out.println(city2);
    }



}
