package simplejava.Dz1;//Задание 3
//В переменной n хранится вещественное число, с ненулевой дробной частью. Создайте программу, округляющую
//число n до ближайшего целого и выводящую результат округления на экран.

public class Task3 {
    public static void main(String[] args) {

        double x = 12.11;
        int y = (int) Math.ceil(x);
        System.out.println(y);

        int z = (int) Math.round(x);
        System.out.println(z);
    }
}
