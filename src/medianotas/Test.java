package medianotas;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your first grade: ");
        double firstGrade = input.nextDouble();
        System.out.print("Type your second grade: ");
        double secondGrade = input.nextDouble();
        System.out.print("Type your third grade: ");
        double thirdGrade = input.nextDouble();

        CalcAvgGrade.calcAvgGrade(firstGrade, secondGrade, thirdGrade);

        input.close();
    }
}
