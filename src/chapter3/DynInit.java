package chapter3;

public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

//        Динамическая инициализация
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Гипотенуза равна " + c);
    }
}
