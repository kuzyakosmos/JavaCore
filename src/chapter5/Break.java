package chapter5;

// Using break as a civilized form of goto.
class Break {
    public static void main(String args[]) {
        String a = args[0];
        boolean t = true;

        first: {
            second: {
                third: {
                }
                System.out.println("Before the break.");
                if(t) break second; // break out of second block
                System.out.println("This won't execute");
            }
            System.out.println("This won't execute");
        }
        System.out.println("This is after second block.");
    }
    public static void kjef(String args[]) {

    }
}

