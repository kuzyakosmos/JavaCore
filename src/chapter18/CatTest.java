package chapter18;

import java.util.HashMap;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "black", 4,5);
        Cat cat1 = new Cat("Vasya", "black", 4,5);
//        System.out.println(cat.equals(cat1));
//        System.out.println(cat.hashCode());
//        System.out.println(cat1.hashCode());
        Cat[] cats = new Cat[5];
        HashMap hashMap = new HashMap<>();
        hashMap.put(cat.getName(),cat);
        hashMap.put("Barsik","Cat");
        hashMap.put(cat1.getName(),cat1);

        System.out.println(hashMap);
    }
}
