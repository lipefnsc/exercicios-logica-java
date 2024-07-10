package verdadeirofalso;

public class TrueOrFalse {

    public static void bothAreTrueOrFalse(boolean a, boolean b) {
        if (a == b) {
            if (a) {
                System.out.println("Both are true.");
            }
            else {
                System.out.println("Both are false.");
            }
        } else {
            System.out.println("The values are different.");
        }
    }

}
