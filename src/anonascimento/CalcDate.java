package anonascimento;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalcDate {
    private static LocalDate currentDate = LocalDate.now();

    public static void calcBirthDate(LocalDate birthDate) {
        long years = ChronoUnit.YEARS.between(birthDate, currentDate);
        long months = ChronoUnit.MONTHS.between(birthDate, currentDate) % 12;
        long days = ChronoUnit.DAYS.between(birthDate, currentDate) % 30;
        System.out.println("You lived " + years + " years, " + months + " months and " + days + " days.");
    }

}
