package collections.list.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4.В начало списка
 *
 * 1. Создай список строк в методе main.
 * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 * 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки
 */

public class Task4 {
    public static void main(String[] args) throws IOException {
        List <String> newStrings = new ArrayList<>();
//        newStrings.add(0,"one");
//        newStrings.add(0,"two");
//        newStrings.add(0,"three");
//        newStrings.add(0,"four");
//        newStrings.add(0,"five");
//        newStrings.add(0,"six");
//        newStrings.add(0,"seven");
//        newStrings.add(0,"eight");
//        newStrings.add(0,"nine" );
//        newStrings.add(0,"ten");
//        for (String newString : newStrings) {
//            System.out.println(newString);
//        }

        Scanner in =new Scanner(System.in);
      //  BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
           // newStrings.add(0,buffer.readLine());
            newStrings.add(0,in.nextLine());
        }

        for(String newString: newStrings) {
            System.out.println(newString);
        }


    }
}
