package lesson11;

public class Run {
    public static void main(String[] args) {
        Security security = new Security("Lena", 34);
        System.out.println(security.print());
        President president = new President("Bill", 70);
        System.out.println(president.print());
    }
}
