package formadepagamento;

public class PriceCalculator {

    public static void calculatePrice(double productPrice, int paymentMethod) {
        if(productPrice < 0) {
            System.out.println("Type a valid price.");
            return;
        }
        switch (paymentMethod) {
            case 1: {
                productPrice = productPrice - (productPrice * 0.15);
                System.out.println("Subtotal: R$" + String.format("%.2f", productPrice));
                break;
            }
            case 2: {
                productPrice = productPrice - (productPrice * 0.10);
                System.out.println("Subtotal: R$" + String.format("%.2f", productPrice));
                break;
            }
            case 3: {
                System.out.println("Subtotal: 2 installments of R$" + String.format("%.2f", (productPrice / 2)));
                break;
            }
            case 4: {
                productPrice = productPrice + (productPrice * 0.10);
                System.out.println("Subtotal: 3 installments of R$" + String.format("%.2f", (productPrice / 3)));
                break;
            }
            default: {
                System.out.println("Type a valid payment method.");
            }
        }
    }

    public static void printPaymentMethods() {
        System.out.println("Type the payment method: ");
        System.out.println("1 - Cash, get 15% discount");
        System.out.println("2 - Cash on credit card, get 10% discount");
        System.out.println("3 - Pay in two installments, normal product price without interest");
        System.out.println("4 - Three installments or more, normal product price plus 10% interest");
    }
}
