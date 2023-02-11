package myfirstobject.printable;

public class Book implements Printable {
    private String name;

    @Override
    public void print() {
        System.out.println("Printing book " + getName());
    }
    public static void printBooks(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Book) {
                System.out.println(printable1);
            }
        }

    }

    public Book(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString () {
        return "Book " + name;
    }
}
