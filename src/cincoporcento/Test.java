package cincoporcento;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Type the value you want to be adjusted: ");
        double value = input.nextDouble();

        CalcAdjustment.calcFivePercent(value);

        input.close();
    }
}
