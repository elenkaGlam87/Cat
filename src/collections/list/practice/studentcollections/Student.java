package collections.list.practice.studentcollections;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;
import java.util.Objects;

/**
 * Добавить студентов в коллекцию.
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3.
 * Если средний балл>=3, студент переводится на следующий курс.
 * Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
 * А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */

public class Student {
    private String name;
    private String group;
    private int course;
    private Map <String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, grades);
    }
}
