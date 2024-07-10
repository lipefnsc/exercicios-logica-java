package imc;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your weight (in KG): ");
        double weight = input.nextDouble();
        System.out.print("Type your height (in METERS): ");
        double height = input.nextDouble();

        CalcBmi.calcBmi(weight, height);

        input.close();
    }
}
