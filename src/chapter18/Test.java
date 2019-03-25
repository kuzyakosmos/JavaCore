package chapter18;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("String");
        Object object = new Object();
        collection.add(object);
        System.out.println(object.toString());
        System.out.println(object);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
