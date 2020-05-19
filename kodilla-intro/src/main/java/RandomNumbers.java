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
        int max <=30;
        if (max >= randomInt) {
            return max;
        }
    }

    static int returnMinNumber(int min, int randomInt) {
        int min >=0;
        int min <30;
        if (min <= randomInt) {
            return min;
        }
    }
}

