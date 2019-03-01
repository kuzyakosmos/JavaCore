package chapter5;

//Целевая часть цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        //расчитать среднее значение переменных i, j

        while (++i < j--)
            System.out.println(i + " " + j);; //у этого цикла отсутствует тело
        System.out.println(i);
    }
}
