package chapter3;

//page 78
//Вычислить расстояние, проходимое светом, используя переменные типа long
public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

//        Приблизительная скорость света, миль/сек
        lightSpeed = 186000;

        days = 1000; //указать кол-во дней

        seconds = days * 24 * 60 * 60; //переводим дни в секунды

        distance = lightSpeed * seconds; //вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");

    }

}
