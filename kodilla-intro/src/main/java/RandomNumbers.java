import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        usingRandomClass();
    }

    static void usingRandomClass() {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(30) + 1;

        int a = 0;
        while ((a + randomInt) <= 5000) {
            int randomInt = randomGenerator.nextInt(30) + 1;
        }
    }
}
