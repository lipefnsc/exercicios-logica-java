package imc;

public class CalcBmi {

    public static void calcBmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            System.out.println("Your Body Mass Index (BMI) is: " + String.format("%.2f", bmi));
            System.out.println("You're underweight.");
        }
        else if (bmi >= 18.6 && bmi <= 24.9) {
            System.out.println("Your Body Mass Index (BMI) is: " + String.format("%.2f", bmi));
            System.out.println("Ideal weight (congrats)");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Your Body Mass Index (BMI) is: " + String.format("%.2f", bmi));
            System.out.println("Slightly overweight");
        }
        else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Your Body Mass Index (BMI) is: " + String.format("%.2f", bmi));
            System.out.println("Grade I obesity ");
        }
        else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Your Body Mass Index (BMI) is: " + String.format("%.2f", bmi));
            System.out.println("Grade II obesity (severe)");
        }
        else {
            System.out.println("Your Body Mass Index (BMI) is: " + String.format("%.2f", bmi));
            System.out.println("Grade III obesity (morbid)");
        }
    }

}
