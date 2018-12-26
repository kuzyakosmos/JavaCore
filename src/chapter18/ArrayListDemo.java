package chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        Создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива al: " + al);

        Integer ia     [] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
//        Суммировать элементы массива
        for (int i : ia) sum += i;

        System.out.println("Сумма: " + sum);

        al.hashCode();
    }
}
