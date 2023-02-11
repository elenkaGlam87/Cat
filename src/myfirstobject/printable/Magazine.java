package myfirstobject.printable;

import java.util.Arrays;

public class Magazine implements Printable {
    private String name;

    @Override
    public void print() {
        System.out.println("Printing magazine " + getName());
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine) {
                System.out.println(printable1);
            }
        }
    }


    public Magazine(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Magazine " + name;
    }
}
