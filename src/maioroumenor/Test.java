package maioroumenor;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.print("Type your age: ");
        int age = input.nextInt();

        OverOrUnderAge.IsOverOrUnderAge(name, age);

        input.close();
    }
}
