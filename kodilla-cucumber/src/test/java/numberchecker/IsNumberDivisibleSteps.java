package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleSteps implements En {
    private int number;
    private String answer;

    public IsNumberDivisibleSteps() {

        Given("the number is {int}", (Integer int1) -> {
            this.number = 6;
        });

        Given("the number is {int}", (Integer int1) -> {
            this.number = 10;
        });

        Given("the number is {int}", (Integer int1) -> {
            this.number = 15;
        });

        Given("the number is {int}", (Integer int1) -> {
            this.number = 4;
        });

        When("I ask number it's divisible by {int} and by {int}", (Integer int1, Integer int2) -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfNumberDivisible(this.number);
        });

        Then("{string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
