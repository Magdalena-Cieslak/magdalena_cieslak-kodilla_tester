package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/Kodilla/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        while (!driver.findElement(By.xpath("//html/body/div/div/div/div/div")).isDisplayed()) {
        }
        driver.findElement(By.xpath("//html/body/div/div/div/div/div/div[2]/button[2]")).click();

        WebElement inputField = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        inputField.sendKeys("mavic mini");

        WebElement categoryDropdown = driver.findElement(By.xpath("/html/body/div/div/header/div/div/div/div/form/div[2]/div/select"));
        Select categorySelect = new Select(categoryDropdown);
        categorySelect.selectByIndex(3);

        inputField = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/button"));
        inputField.submit();

    }
}
