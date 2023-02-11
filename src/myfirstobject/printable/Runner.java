package myfirstobject.printable;

public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание");
        Book book2 = new Book("Война и мир");
        Magazine magazine1 = new Magazine("Vogue");
        Magazine magazine2 = new Magazine("Cosmopolitan");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();
        }
        System.out.println();
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}

