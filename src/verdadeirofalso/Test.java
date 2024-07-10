package verdadeirofalso;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first boolean value (true or false): ");
        boolean a = input.nextBoolean();
        System.out.print("Type the second boolean value (true or false): ");
        boolean b = input.nextBoolean();

        TrueOrFalse.bothAreTrueOrFalse(a, b);

        input.close();
    }
}
