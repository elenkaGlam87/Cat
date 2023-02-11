package lesson11;

/**
 * Создать абстрактный базовый класс Worker (работника) с методом Print(). Создайте четыре производных
 * класса: President, Security, Manager, Engineer. Переопределите метод.
 * Print() для вывода информации, соответствующей каждому типу работника.
 */

public abstract class Worker {
    private String nameWorker;
    private int ageWorker;

    public Worker (String nameWorker, int ageWorker) {
        this.nameWorker=nameWorker;
        this.ageWorker=ageWorker;
    }

    public String getNameWorker () {
        return this.nameWorker;
    }

    public int getAgeWorker () {
        return this.ageWorker;
    }

    public String print () {
        return "Class Worker has fields: nameWorker " + nameWorker + " , ageWorker " + ageWorker;
    }
}
