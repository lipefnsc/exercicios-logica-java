package salarioprofessor;

public class CalcNetSalary {

    public static void calcNetSalary(Teacher teacher) {
        double grossSalary = teacher.getClassHourPrice() * teacher.getClassesTaughtInMonth();
        double discount = grossSalary * Teacher.INSS_DISCOUNT;
        double netSalary = grossSalary - discount;

        System.out.println("The teacher net salary is: $" + String.format("%.2f", netSalary));
    }

}
