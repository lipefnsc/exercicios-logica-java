package triangulo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the value of the first side of the triangle: ");
        int a = input.nextInt();
        System.out.print("Type the value of the second side of the triangle: ");
        int b = input.nextInt();
        System.out.print("Type the value of the third side of the triangle: ");
        int c = input.nextInt();

        TriangleType.findTriangleType(a, b, c);

        input.close();
    }
}
