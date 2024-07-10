package trocavalores;

public class ExchangeValues {

    public static void exchangeValue(int a, int b) {
        System.out.println("TYPED VALUES: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("EXCHANGED VALUES: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

}
