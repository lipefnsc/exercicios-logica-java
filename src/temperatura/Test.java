package temperatura;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the temperature in Farenheit: ");
        double farenheitTemperature = input.nextDouble();

        CalcTemperature.farenheitToCelsius(farenheitTemperature);

        input.close();
    }
}
