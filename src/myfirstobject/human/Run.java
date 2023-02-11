package myfirstobject.human;

public class Run {

    public static void main(String[] args) {
        Human human = new Human();
        human.setFirstName("Alena");
        human.setLastName("Husakova");
        human.setBirthday("July 27");
        human.setTelephoneNumber("+375295157201");
        human.setCity("Vitebsk");
        human.setCountry("Republic of Belarus");
        human.setAddress("Moskovski street");

        System.out.println(human.getFirstName());
        System.out.println(human.getLastName());
        System.out.println(human.getBirthday());
        System.out.println(human.getTelephoneNumber());
        System.out.println(human.getCity());
        System.out.println(human.getCountry());
        System.out.println(human.getAddress());

        System.out.println();

        System.out.println(human);

        System.out.println();

        Human human1 = new Human("Kiril", "Husakov", "23 april", "+375297122695",
                "Vitebsk", "435000", "Moskovski, 87");

        System.out.println(human1);

        System.out.println();

        Human human2 = new Human("Anna", "Karenina");
        System.out.println(human2);
    }
}
