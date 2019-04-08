package chapter18.book;

import chapter18.Cat;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String args[]) {
        // Create an array list.
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Initial size of al: " +
                al.size());

        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size of al after additions: " +
                al.size());

        // Display the array list.
        System.out.println("Contents of al: " + al);

        // Remove elements from the array list.
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " +
                al.size());
        System.out.println("Contents of al: " + al);
        System.out.println();

        System.out.println(al.getClass());
        System.out.println(al.get(3));
        System.out.println(al.indexOf("sdcdwq"));
//        al.remove(34);
        Cat asx = new Cat();
        System.out.println(al.remove(asx));
        al.remove("wdewf");
    }
}