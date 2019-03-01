package chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i равно 0.");
                    break;
                case 1:
                    System.out.println("i равно 1.");
                    break;
                case 2:
                    System.out.println("i равно 2.");
                    break;
                case 3:
                    System.out.println("i равно 3.");
                    break;
                default:
                    System.out.println("i больше 3.");

            }
    }
}
