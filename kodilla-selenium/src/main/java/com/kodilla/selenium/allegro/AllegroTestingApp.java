package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/Kodilla/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        wait(driver);
        driver.findElement(By.xpath("//html/body/div/div/div/div/div/div[2]/button[2]")).click();

        WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
        inputField.sendKeys("mavic mini");

        WebElement categoryDropdown = driver.findElement(By.cssSelector("form > div > div > select"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByIndex(3);

        inputField = driver.findElement(By.cssSelector("form > button"));
        inputField.submit();

        List<WebElement> elements = driver.findElements(By.cssSelector("._9c44d_1V-js"));
        System.out.println(elements.get(0).getText());
    }

    private static void wait(WebDriver driver) {
        while (!driver.findElement(By.xpath("//html/body/div[3]/div[8]/div/div[2]/div")).isDisplayed()) {
        }
    }
}
