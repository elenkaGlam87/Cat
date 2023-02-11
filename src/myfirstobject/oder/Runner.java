package myfirstobject.oder;

public class Runner {
    public static void main(String[] args) {
        Order order1 = new Order(155, "чайник", "Машков.И.С.");
        Order order2 = new Order(157, "утюг", "Иванов Е.А.");

        order1.setDateTime("11 июля, 12:30");
        order1.setType("срочный заказ");

        order2.setDateTime("25 июля, 17:00");
        order2.setType("обычный заказ");

        System.out.println(order1);
        System.out.println();
        System.out.println(order2);
    }
}
