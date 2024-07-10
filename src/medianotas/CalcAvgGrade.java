package medianotas;

public class CalcAvgGrade {

    public static void calcAvgGrade(double firstGrade, double secondGrade, double thirdGrade) {
        if (firstGrade < 0 || firstGrade > 10 || secondGrade < 0 || secondGrade > 10 || thirdGrade < 0 || thirdGrade > 10) {
            System.out.println("The grades must be higher than 0 and lower than 10.");
            return;
        }
        double gradesAvg = (firstGrade + secondGrade + thirdGrade) / 3;
        System.out.println("The average of your grades is: " + String.format("%.2f", gradesAvg));
    }
}
