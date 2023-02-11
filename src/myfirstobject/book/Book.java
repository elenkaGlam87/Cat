package myfirstobject.book;

/**
 * Задание 5.
 * Реализуйте класс «Книга». Необходимо хранить в полях класса: название книги, ФИО автора, год выпуска,
 * название издательства, жанр книги, количество страниц.
 * Реализуйте конструкторы и методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным
 * полям через методы класса. Используйте механизм перегрузки методов.
 */

public class Book {

    String title;
    String author;
    int yearRelease;
    String namePublishingHouse;
    String genre;
    int quantityPage;

    Book() {

    }

    Book(String title, String author, int yearRelease, String namePublishingHouse, String genre, int quantityPage) {
        this.title = title;
        this.author = author;
        this.yearRelease = yearRelease;
        this.namePublishingHouse = namePublishingHouse;
        this.genre = genre;
        this.quantityPage = quantityPage;
    }

    Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getAuthor() {
        return this.author;
    }

    void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    int getYearRelease() {
        return this.yearRelease;
    }

    void setNamePublishingHouse(String namePublishingHouse) {
        this.namePublishingHouse = namePublishingHouse;
    }

    String getNamePublishingHouse() {
        return this.namePublishingHouse;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    String getGenre() {
        return this.genre;
    }

    void setQuantityPage(int quantityPage) {
        this.quantityPage = quantityPage;
    }

    int getQuantityPage() {
        return this.quantityPage;
    }

    public String toString() {
        return "Объект Книга имеет поля: Название книги " + title + " ФИО автора " + author + " Год выпуска " +
                yearRelease + " Название издательства " + namePublishingHouse + " Жанр книги " + genre +
                " Количество страниц " + quantityPage;
    }
}
