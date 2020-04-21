package com.hbs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample
{

    private static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com");

        new Actions(driver)
                .moveToElement(driver.findElement(By.linkText("Home")))
                .build()
                .perform();

//        driver.close();
    }
}
