package chapter3;

public class Scope {
    public static void main(String[] args) {
        int x; //эта переменная доступна всему коду из метода main()

        x = 10;
        if (x==10) {     //начало новой области действия,
            int y = 20;  //доступной только тому блоку кода

            System.out.println(x*y); //все збс
        }
//        System.out.println(y); //ошибка
        System.out.println(x); //а Х так и доступна
    }
}
