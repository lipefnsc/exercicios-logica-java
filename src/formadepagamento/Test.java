package formadepagamento;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the product price: ");
        double productPrice = input.nextDouble();
        PriceCalculator.printPaymentMethods();
        int paymentMethod = input.nextInt();

        PriceCalculator.calculatePrice(productPrice, paymentMethod);

        input.close();
    }
}
