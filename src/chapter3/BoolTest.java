package chapter3;

//page 81
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is equal to " + b);
        b = true;
        System.out.println("b is equal to " + b);

        //a boolean value can control the IF statement
        if (b) System.out.println("This code is running");
        b = false;
        if (b) System.out.println("This code isn't running");

        //the result of the comparasion is a boolean value
        System.out.println("10 > 9 is equal to " + (10 > 9));
    }
}
