package com.hbs.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome
{
    private static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
        System.out.println("******"+driver.getTitle()+"******");
        driver.close();
    }
}
