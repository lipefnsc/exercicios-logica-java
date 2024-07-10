package salario;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your salary: ");
        int salary = input.nextInt();

        Operations.howManySalaries(salary);

        input.close();
    }
}
