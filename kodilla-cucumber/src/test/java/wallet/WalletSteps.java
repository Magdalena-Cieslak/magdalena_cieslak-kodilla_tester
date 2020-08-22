package wallet;

import com.sun.org.apache.bcel.internal.generic.NEW;
import io.cucumber.java8.Ca;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });


        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
        });

        When("I request $130", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 130);
        });

        Then("$130 shouldn't be dispensed", () -> {
            Assert.assertNotEquals(100, cashSlot.getContents());
        });
    }
}
