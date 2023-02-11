package myfirstobject.IShow;

import java.util.Arrays;

public class Array implements IShow, IMath, ISort {


    @Override
    public void Print() {
        int[] mas = {1, 5, 8, 9};
        System.out.println(Arrays.toString(mas));
    }

    @Override
    public void Print(String info) {
        int[] mas = {8, 5, 0, 7};
        System.out.println(info);
        System.out.println(Arrays.toString(mas));
    }

    @Override
    public int Max() {
        int[] mas = {4, 1, 9, 17, 28};
        int maxElement = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxElement) {
                maxElement = mas[i];
            }
        }
        return maxElement;
    }

    @Override
    public int Min() {
        int[] mas = {4, 1, 9, 17, 28};
        int minElement = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < minElement) {
                minElement = mas[i];
            }
        }
        return minElement;
    }

    @Override
    public float Avg() {
        int[] mas = {4, 1, 9, 17, 28};
        float avg = 0;
        for (int i = 0; i < mas.length; i++) {
            avg += mas[i];
        }
        return avg / (mas.length);
    }

    @Override
    public void SortAsc() {
        int[] mas = {28, 1, 9, 17, 4};
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] > mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    @Override
    public void SortDesc() {
        int[] mas = {28, 1, 9, 17, 4};
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] < mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
