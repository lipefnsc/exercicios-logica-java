package seigualsomar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int a = input.nextInt();
        System.out.print("Type the second number: ");
        int b = input.nextInt();

        Operations.ifEqualSumIfDifferentMultiply(a, b);

        input.close();
    }
}
