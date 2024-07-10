package aprovadoreprovado;

public class CalcAvgGrade {

    public static void calcAvgGrade(String name, double firstGrade, double secondGrade, double thirdGrade, double fourthGrade) {
        if (firstGrade < 0 || firstGrade > 10 || secondGrade < 0 || secondGrade > 10 || thirdGrade < 0 || thirdGrade > 10 || fourthGrade < 0 || fourthGrade > 10) {
            System.out.println("The grades must be higher than 0 and lower than 10.");
            return;
        }
        double gradesAvg = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;
        System.out.println("The average of your grades is: " + String.format("%.2f", gradesAvg));
        if (gradesAvg >= 7) {
            System.out.println("Congrats " + name + ", you have been approved!");
        } else {
            System.out.println("You failed.");
        }
    }

}
