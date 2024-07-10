package tabuada;

public class PrintMultiplicationTable {

    public static void printMultiplicationTable(int numberToMultiplicate) {
        for (int i = 1; i <= 10; i++) {
            int result = numberToMultiplicate * i;
            System.out.println(numberToMultiplicate + " * " + i + " = " + result);
        }
    }
}
