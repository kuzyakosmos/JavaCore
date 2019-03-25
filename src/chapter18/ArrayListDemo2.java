package chapter18;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String args[]) {
        // Create an array list.
        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.println("Initial size of al: " +
                al.size());

        // Add elements to the array list.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
//        al.add(1, 1488);

        System.out.println("Size of al after additions: " +
                al.size());

        // Display the array list.
        System.out.println("Contents of al: " + al);

        // Remove elements from the array list.
        Integer integer = 1;
        al.remove(integer);

        System.out.println("Size of al after deletions: " +
                al.size());
        System.out.println("Contents of al: " + al);
    }
}
