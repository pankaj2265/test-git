package com.thetestingacademy.practice.july16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Selenium09Test {
    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        //driver.get("https://katalon-demo-cura.herokuapp.com/profile.php");
        // WebElement headertext = driver.findElement(By.xpath("//h1"));
        //System.out.println(headertext.getText());
        //WebElement emailId_CSS = driver.findElement(By.cssSelector("#login-username"));
        //  WebElement emailClassName_CSS = driver.findElement(By.cssSelector(".className"));

        driver.get("https://awesomeqa.com/css/");

        List<WebElement> list_of_spans = driver.findElements(By.cssSelector("div.first > span"));
        System.out.println(list_of_spans.get(2).getText());



        driver.quit();

    }
}
