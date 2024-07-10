package quocienteresto;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int a = input.nextInt();
        System.out.print("Type the second number: ");
        int b = input.nextInt();

        CalcDivision.quotientAndRemainder(a, b);

        input.close();
    }
}
