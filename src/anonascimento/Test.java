package anonascimento;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your birth year (yyyy): ");
        int year = input.nextInt();
        System.out.print("Type your birth month (1 - 12): ");
        int month = input.nextInt();
        System.out.print("Type your birth day (1 - 30): ");
        int day = input.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);

        CalcDate.calcBirthDate(birthDate);

        input.close();
    }
}
