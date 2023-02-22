/*
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 5 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i,sc.next());
        }
        for (int i = 0; i < 8; i++) {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}