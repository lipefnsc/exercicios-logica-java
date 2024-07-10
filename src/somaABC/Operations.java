package somaABC;

public class Operations {
    private int result;

    public void sum(int a, int b) {
        this.result = a + b;
        System.out.println("The result of the first number plus the second number is: " + this.result);
    }

    public void isBigger(int c) {
        if(c > this.result) {
            System.out.println("The third number typed (" + c + ") is greater than the sum of the first two.");
        }
        else {
            System.out.println("The third number typed (" + c + ") isn't greater than the sum of the first two.");
        }
    }

}

