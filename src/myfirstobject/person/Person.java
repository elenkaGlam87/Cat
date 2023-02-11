package myfirstobject.person;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) метод talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте 2 объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(String fullName) {
        System.out.println(fullName + " говорит.");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String toString () {
       return "Класс Person содержит поля: fullName - " + fullName + ", age - " + age;
    }
}
