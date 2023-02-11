package myfirstobject.contact;

public class Runner {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Lena", "Husakova", "Vitebsk, Moskovski street, 87, 61");
        Contact contact2 = new Contact("Ivan", "Morozov", "Minsk, Nezavisimosti, 65, 15");

        contact1.setId(12345);
        contact1.setPhone("+375295157201");
        contact1.setNote("одноклассница");

        contact2.setId(35489);
        contact2.setPhone("+375444569817");
        contact2.setNote("друг");

        System.out.println(contact1);
        System.out.println(contact2);
    }
}
