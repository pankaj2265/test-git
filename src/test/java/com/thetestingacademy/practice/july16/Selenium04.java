package com.thetestingacademy.practice.july16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium04 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getCurrentUrl());


        //driver.navigate().refresh();
driver.quit();
    }
}