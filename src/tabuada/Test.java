package tabuada;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the number you want to calculate the multiplication table for: ");
        int number = input.nextInt();

        PrintMultiplicationTable.printMultiplicationTable(number);

        input.close();
    }
}
