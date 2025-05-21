package com.thetestingacademy.practice.july16;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Selenium02 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        //WebDriver driver1 = new ChromeDriver(options);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();
        //driver.close();
        //System.out.println(driver.getTitle());
    }
}
