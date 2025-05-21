package com.thetestingacademy.practice.july16;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium05Test {
    /*
    2 testcases
    1 negative- invalid login credentials-login unsuccessful-error
    1 positive- valid credentials-login successful-dashboard page
    */
     ChromeOptions options;
    WebDriver driver;
    @BeforeSuite
    public void setUp() {
        options= new ChromeOptions();
        options.addArguments("--start-maximized");
       driver= new ChromeDriver(options);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1,groups = {"negative","sanity"})
    @Severity(SeverityLevel.BLOCKER)
    @Description(value = "TC#1 verify that with invalid username and password login is not successful")

    public void testInvalidLogin() {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("contact+augg@thetestingacademy.co");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();
        WebElement errormessage = driver.findElement(By.className("notification-box-description"));

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(errormessage));
        //Thread.sleep(5000);
        //Assertion-checking expected result= actual result
        String errorString = driver.findElement(By.className("notification-box-description")).getText();
        Assert.assertEquals(errorString, "Your email, password, IP address or location did not match");
    }
    @Test(priority = 2,groups = {"positive","sanity"})
    @Description(value= "TC#2 verify that with vali[d username and password login is successful")

    public void testValidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("contact+augg@thetestingacademy.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();


        //Thread.sleep(15000);

        Assert.assertEquals(driver.getTitle(),"Dashboard");
        //System.out.println(driver.getTitle());

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
