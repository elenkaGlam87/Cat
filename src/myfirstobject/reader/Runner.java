package myfirstobject.reader;

public class Runner {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров", 1, "Экономический", "25 july", "+37582556");
        Reader reader2 = new Reader("Иванов", 2, "Технический", "2 January", "+37258501");
        Reader reader3 = new Reader("Гусакова", 3, "Педагогический", "16 May", "+3711126");
        Reader reader4 = new Reader("Щеглова", 4, "Экономический", "7 October", "+32058214");
        Reader reader5 = new Reader("Ильющенко", 5, "Физкультурный", "8 March", "+4458935");

        Book book1 = new Book("Словарь", "Ю.А.Даль");
        Book book2 = new Book("Энциклопедия", "K.О.Иванов");

        Reader[] readers = {reader1, reader2, reader3, reader4, reader5};

//        for (int i = 0; i < readers.length; i++) {
//            System.out.println(readers[i].getLastname());
//
//        }
//
//        for (int i = 0; i < readers.length; i++) {
//            readers[i].takeBook(5);
//            readers[i].takeBook("Поезд", "Мечта", "Море");
//
//        }
        reader2.takeBook(2);
        reader3.takeBook("Война и мир", "Преступление и наказание");

        reader4.returnBook(2);
        reader4.returnBook(book1, book2);



    }
}
