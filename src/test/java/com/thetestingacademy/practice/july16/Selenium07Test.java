package com.thetestingacademy.practice.july16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium07Test {
    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.get("https://app.vwo.com/#/login");


        WebElement StartTrial = driver.findElement(By.linkText("Read about the latest VWO integration"));
        //WebElement ReadLink = driver.findElement(By.partialLinkText("free trial"));
        StartTrial.click();
        //ReadLink.click();

        driver.quit();
    }

}
