package temperatura;

public class CalcTemperature {

    public static void farenheitToCelsius(double farenheitTemperature) {
        double celsiusTemperature = 5 * (farenheitTemperature - 32) / 9;
        System.out.println("TYPED TEMPERATURE (F): " + farenheitTemperature);
        System.out.println("TEMPERATURE IN CELSIUS (C): " + String.format("%.2f", celsiusTemperature));
    }
}
