package device;

public class Runner {
    public static void main(String[] args) {
        Device device = new Device("Device", 15, "fgh");
        Kettle kettle = new Kettle("Tefal", 300, "gvb", 456);
        Microwave microwave = new Microwave("Samsung", 420, "dsa");
        device.showName();
        kettle.showName();
        microwave.makeSound();
        System.out.println();
        System.out.println(microwave.descDevice());
        System.out.println(microwave.weight());
    }
}
