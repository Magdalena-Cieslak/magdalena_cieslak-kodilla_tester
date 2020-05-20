import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        usingRandomClass();
    }

    static void usingRandomClass() {

        Random randomGenerator = new Random();
        int sum = 0;
        while (sum <= 5000) {
            int randomInt = randomGenerator.nextInt(30) + 1;
            sum = sum + randomInt;
            System.out.println(sum);
        }
    }

    static int returnMaxNumber(int max, int randomInt) {
        if (max >= randomInt) {
            return max;
        } else {
            return randomInt;
        }
    }

    static int returnMinNumber(int min, int randomInt) {
        if (min <= randomInt) {
            return min;
        } else {
            return randomInt;
        }
    }
}

