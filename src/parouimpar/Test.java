package parouimpar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type the desired number");
        int number = input.nextInt();

        Operations.result(number);

        input.close();

    }
}
