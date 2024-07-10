package salario;

public class Operations {
    public static final double MINIMUM_SALARY = 1293.20;

    public static void howManySalaries(double salary) {
        if (salary < 0) {
            System.out.println("Your must type a salary higher than 0.");
        }
        else {
            double salaryAmount = salary / MINIMUM_SALARY;
            System.out.println("You earn " + String.format("%.2f", salaryAmount) + " minimun salaries.");
        }
    }

}
