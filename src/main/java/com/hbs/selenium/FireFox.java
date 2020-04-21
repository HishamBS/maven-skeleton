package com.hbs.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox
{
    private static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com");
        System.out.println("******"+driver.getTitle()+"******");
        driver.close();



    }
}
