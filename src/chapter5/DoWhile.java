package chapter5;

//Условие прерывание цикла проверяется в конце, а не в начале
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
    }
}
