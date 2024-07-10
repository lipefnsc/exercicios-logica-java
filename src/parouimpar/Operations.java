package parouimpar;

public class Operations {

    public static void result(int number) {
        if (number % 2 == 0 && number > 0) {
            System.out.println(number + " is even and positive.");
        } else if (number % 2 == 0 && number < 0) {
            System.out.println(number + " is even and negative.");
        } else if (number % 2 != 0 && number > 0) {
            System.out.println(number + " is odd and positive.");
        } else {
            System.out.println(number + " is odd and negative.");
        }
    }

}
