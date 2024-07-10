package trocavalores;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first value: ");
        int a = input.nextInt();
        System.out.print("Type the first value: ");
        int b = input.nextInt();

        ExchangeValues.exchangeValue(a, b);

        input.close();
    }
}
