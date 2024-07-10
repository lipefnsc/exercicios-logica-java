package ordemdecresente;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int a = input.nextInt();
        System.out.print("Type the second number: ");
        int b = input.nextInt();
        System.out.print("Type the third number: ");
        int c = input.nextInt();

        PrintDescendingOrder.printInDescendingOrder(a, b, c);

        input.close();
    }
}
