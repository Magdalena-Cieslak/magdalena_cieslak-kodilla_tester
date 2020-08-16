package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/Kodilla/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.alertIsPresent());

        wait.until(driver.findElement(By.xpath("//html/body/div/div/div/div/div")).isDisplayed());
        driver.findElement(By.xpath("//html/body/div/div/div/div/div/div[2]/button[2]")).click();
        wait.until(!driver.findElement(By.xpath("//html/body/div/div/div/div/div")).isDisplayed());

        WebElement inputField = driver.findElement(By.cssSelector(".mp4t_8 mp4t_0_m mryx_8 mryx_0_s m7er_k4 m7er_k4 m7er_wn _fee54_02svT"));
        inputField.sendKeys("mavic mini");

        WebElement categoryDropdown = driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/form/div[2]/div/select"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByIndex(3);

        inputField = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/button"));
        inputField.submit();

    }
}
