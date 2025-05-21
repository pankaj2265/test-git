package com.thetestingacademy.practice.july16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium08Test {
    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php");
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        //a[@id='btn-make-appointment']
    }
}
