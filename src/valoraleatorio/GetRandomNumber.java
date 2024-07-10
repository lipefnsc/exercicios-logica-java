package valoraleatorio;

import java.util.Random;

public class GetRandomNumber {

    public static void getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random number between 0 and 100: " + randomNumber);
    }
}
