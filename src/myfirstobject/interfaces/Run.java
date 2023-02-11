package myfirstobject.interfaces;

public class Run {
    public static void main(String[] args) {
        MyInterface plain = new Plain();
        MyInterface bee = new Bee();
        plain.fly();
        bee.fly();
        bee.flyAgain();
    }
}
