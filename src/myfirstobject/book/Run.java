package myfirstobject.book;

public class Run {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Война и мир");
        book.setAuthor("Л.Н.Толстой");
        book.setYearRelease(1873);
        book.setNamePublishingHouse("Русский вестник");
        book.setGenre("роман");
        book.setQuantityPage(9536);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYearRelease());
        System.out.println(book.getNamePublishingHouse());
        System.out.println(book.getGenre());
        System.out.println(book.getQuantityPage());

        System.out.println();

        System.out.println(book);

        System.out.println();

        Book book1 = new Book("Алые паруса", "Александр Грин", 1923, "Френкель",
                "повесть", 469);
        System.out.println(book1);

        Book book2 = new Book("Волк и семеро козлят", "сказка");
        System.out.println(book2);
    }
}
