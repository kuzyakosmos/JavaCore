package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("Х меньше Y");

        x = x * 2;
        if (x == y) System.out.println("X теперь равно Y");

        x = x * 2;
        if (x > y) System.out.println("X теперь больше Y");

//        Этот оператор не будет ничего выводить
        if (x == y) System.out.println("вы не увидете этого");
    }
}
