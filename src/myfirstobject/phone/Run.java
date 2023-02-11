package myfirstobject.phone;

public class Run {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("+3541299", "Samsung", 300);
        Phone phoneTwo = new Phone("+337540211", "Xiaomi", 380);
        Phone phoneThree = new Phone("+295714403", "Honor", 290);

        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        System.out.println(phoneThree);

        phoneTwo.receiveCall("Alex");
        System.out.println(phoneOne.getNumber("Номер звонящего: " + "+291053317"));
    }
}
