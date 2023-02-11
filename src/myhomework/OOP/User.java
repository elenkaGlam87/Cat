package myhomework.OOP;

/**
 * Урок 2. Создание класса.
 *  Создайте класс User со следующими полями, подобрав правильный тип данных: id, логин, пароль.
 *  Создайте конструктор класса User, приняв все 3 параметра для полей.
 *  Присвойте полям полученные параметры.
 *  Создайте два объекта класса User с различными входными параметрами.
 *  Выведите в консоль все поля обоих объектов в следующем виде (можно с использованием массива и цикла):
 * «id=5; логин=admin; password=abc»
 * Примечание: id – это уникальный идентификатор. Он всегда является только целым положительным числом
 */

public class User {

    private static int count = 0;
    public int id;
    private String login;
    private String password;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }

    void setLogin(String login) {
        this.login = login;
    }

    String getLogin() {
        return this.login;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return this.password;
    }

    void setId() {
        id = 0;
    }

    void setLogin() {
        login = "guest";
    }

    void setPassword() {
        password = "";
    }


    User(String login, String password) {
        this.id = ++count;
        this.login = login;
        this.password = password;
    }

    public String toString() {
        return " id = " + id + "; логин= " + login + " ; пароль= " + password;
    }

}
