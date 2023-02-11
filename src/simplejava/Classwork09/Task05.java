package simplejava.Classwork09;

/**
 * Задание 5
 * Напишите метод, который возвращает сумму чисел в указанном диапазоне.
 * Границы диапазона передаются в качестве параметров.
 */

public class Task05 {
    public static void main(String[] args) {
        int num1=1;
        int num2=5;
        int sum=sumNumber(num1,num2);
        System.out.println(sum);
    }

    public static int sumNumber (int num1, int num2) {
        int result=0;
        for (int i = num1; i <=num2; i++) {
            result+=i;
        }
        return result;
    }
}
