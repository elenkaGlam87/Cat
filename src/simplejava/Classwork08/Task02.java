package simplejava.Classwork08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание 2
 * Пользователь с клавиатуры вводит зарплату сотрудников фирмы. Необходимо отсортировать полученные
 * данные по возрастанию или убыванию в зависимости от выбора пользователя.
 * Выбор алгоритма сортировки необходимо обосновать вашему преподавателю
 */

public class Task02 {
    public static void main(String[] args) {
        int[] mass = new int[5];
        Scanner r = new Scanner(System.in);


        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите зарплату " + (i + 1) + " сотрудника");
            mass[i] = r.nextInt();
        }
        System.out.println("Массив" + Arrays.toString(mass));
        r.nextLine();

        boolean sorted_up = false;
        boolean sorted_down = false;
        int temp = 0;
        String up = "по возрастанию";
        String down = "по убыванию";
        System.out.println("Введите условие сортировки");

        String vvod = r.nextLine();

        if (vvod.toLowerCase().equals(up)) {
            while (!sorted_up) {
                sorted_up = true;
                for (int i = 0; i < mass.length - 1; i++) {
                    if (mass[i] > mass[i + 1]) {
                        temp = mass[i];
                        mass[i] = mass[i + 1];
                        mass[i + 1] = temp;
                        sorted_up = false;
                    }
                }
            }
            System.out.println("Зарплата по возрастанию " + Arrays.toString(mass));
        } else if (vvod.toLowerCase().equals(down)) {
            while (!sorted_down) {
                sorted_down = true;
                for (int i = 0; i < mass.length - 1; i++) {
                    if (mass[i] < mass[i + 1]) {
                        temp = mass[i];
                        mass[i] = mass[i + 1];
                        mass[i + 1] = temp;
                        sorted_down = false;
                    }
                }
            }
            System.out.println("Зарплата по убыванию " + Arrays.toString(mass));
        }

    }
}
