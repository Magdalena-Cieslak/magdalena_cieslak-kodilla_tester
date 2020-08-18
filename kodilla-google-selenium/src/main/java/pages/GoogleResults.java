package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;


    public GoogleResults openRandomResult() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        Random random = new Random();
        int drawnIndex = random.nextInt(6);

        wait.until(ExpectedConditions.elementToBeClickable(results.get(drawnIndex))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
}
