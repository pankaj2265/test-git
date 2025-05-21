package com.thetestingacademy.practice.july16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Selenium01 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions(); // created chromeoption instance
        //options.addArguments("--incognito");//setting the custom option
        //options.addArguments("--headless");
       // options.addExtensions(new File("C:/Users/ASUS/Downloads/extension_5_9_0_0.crx"));
        //options.addArguments("--window-size=1280,800");
        //options.addArguments("--start-maximized");
        //options.addArguments("--disable-infobars");
        options.addArguments("user-data-directory=C:\\Users\\ASUS\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 8");
        //options.addArguments("--lang=hi");
       // options.addArguments("--disable-extensions");
        //options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options); //perform actions by applying the set custom options,
                           // without passing the arguements it will work as a regular chromedriver instance
                               // and it will perform tasks normally without any customization.
driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//driver.quit();

    }
}
