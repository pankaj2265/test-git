package com.thetestingacademy.practice.july16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium03 {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.navigate().to(new URL("https://www.google.com"));
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.navigate().forward();
        //driver.navigate().refresh();
    }
}
