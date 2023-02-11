package myfirstobject.IShow;

public class Run {
    public static void main(String[] args) {
        Array array = new Array();
        array.Print();
        array.Print("Массив целых чисел");
        System.out.println("Значение максимального элемента массива: " + array.Max());
        System.out.println("Значение минимального элемента массива: " + array.Min());
        System.out.println("Среднеарифметическое среди элементов массива: " + array.Avg());
        array.SortAsc();
        array.SortDesc();
    }
}
