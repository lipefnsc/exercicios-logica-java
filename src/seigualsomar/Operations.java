package seigualsomar;

public class Operations {

    public static void ifEqualSumIfDifferentMultiply(int a, int b) {
        int result = 0;
        if(a == b) {
            result += (a + b);
            System.out.print("The numbers are equal. Result: ");
        }
        else {
            result += (a * b);
            System.out.print("The numbers are different. Result: ");
        }
        System.out.print(result);
    }
}
