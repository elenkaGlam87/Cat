package myfirstobject.IShow;

/**
 * Создайте интерфейс ISort. В нём должно быть два метода:
 * ■ void SortAsc() — сортировка по возрастанию;
 * ■ void SortDesc() — сортировка по убыванию.
 * Класс, созданный в первом задании Array, должен имплементировать интерфейс ISort.
 * Метод SortAsc — сортирует массив по возрастанию.
 * Метод SortDesc — сортирует массив по убыванию.
 * Напишите код для тестирования полученной функциональности
 */

public interface ISort {
    void SortAsc();
    void SortDesc();
}
