package ordemdecresente;

public class PrintDescendingOrder {

    public static void printInDescendingOrder(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("The values must be different");
            return;
        }
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("The values in descending order are: " + a + ", " + b + ", " + c + ".");
    }

}
