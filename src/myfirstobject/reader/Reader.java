package myfirstobject.reader;

import java.util.Arrays;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
 * факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(),
 * returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В.
 * взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя
 * и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
 * Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */

public class Reader {
    private String lastname;
    private int numberReader;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String lastname, int numberReader, String faculty, String dateOfBirth, String phoneNumber) {
        this.lastname = lastname;
        this.numberReader = numberReader;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countBook) {
        System.out.println(lastname + " взял " + countBook + " книг(и). ");
    }

    public void takeBook(String... book) {
        System.out.println(lastname + " взял книги: " + Arrays.toString(book));
    }

    public void takeBook(Book books, Book book) {
        System.out.println(lastname + "взял книги:" + books + " , " + book);
    }

    public void returnBook(int countBooks) {
        System.out.println(lastname + " вернул " + countBooks + " книг(и). ");
    }

    public void returnBook(Book book1, Book book2) {
        System.out.println(lastname + " вернул книги: " + book1.getNameBook() + " , " + book2.getNameBook());
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setNumberReader(int numberReader) {
        this.numberReader = numberReader;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public int getNumberReader() {
        return numberReader;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "lastname='" + lastname + '\'' +
                ", numberReader=" + numberReader +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
