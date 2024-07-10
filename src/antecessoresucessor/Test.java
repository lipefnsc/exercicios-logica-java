package antecessoresucessor;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the desired number: ");
        int number = input.nextInt();

        Operations.predecessorAndSuccessor(number);

        input.close();
    }
}
