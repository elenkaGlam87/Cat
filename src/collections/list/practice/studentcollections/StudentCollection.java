package collections.list.practice.studentcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Добавить студентов в коллекцию.
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3.
 * Если средний балл>=3, студент переводится на следующий курс.
 * Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
 * А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */

public class StudentCollection {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "A10", 2, Map.of(
                "Math", 3,
                "Russian", 4,
                "English", 2
        )));

        students.add(new Student("Mary", "A15", 1, Map.of(
                "Math", 4,
                "Russian", 2,
                "English", 5
        )));

        students.add(new Student("Olga", "A15", 1, Map.of(
                "Math", 4,
                "Russian", 2,
                "English", 3
        )));

        students.add(new Student("Dima", "A10", 2, Map.of(
                "Math", 2,
                "Russian", 1,
                "English", 4
        )));

        students.add(new Student("Ben", "A25", 3, Map.of(
                "Math", 4,
                "Russian", 3,
                "English", 3
        )));

        students.add(new Student("Alex", "A25", 3, Map.of(
                "Math", 2,
                "Russian", 3,
                "English", 3
        )));
        System.out.println(middleGrade(students.get(0)));
    }

    public static Integer middleGrade (Student student) {
        Integer sumGrade =0;
        for (Integer value : student.getGrades().values()) {
            sumGrade+=value;
        }
        return sumGrade/student.getGrades().size();
    }
}
