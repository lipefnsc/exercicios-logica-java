package somaABC;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Operations op = new Operations();

        System.out.print("Type the first number: ");
        int a = input.nextInt();
        System.out.print("Type the second number: ");
        int b = input.nextInt();
        System.out.print("Type the third number: ");
        int c = input.nextInt();

        op.sum(a, b);
        op.isBigger(c);

        input.close();

    }
}
