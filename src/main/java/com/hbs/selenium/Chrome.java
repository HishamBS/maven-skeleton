package com.hbs.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome
{

    private static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // run it as headless
        ChromeOptions opts = new ChromeOptions().addArguments(
                "--headless",
                "--disable-gpu",
                "--window-size=640,480",
                "--ignore-certificate-errors"
        );

        // can remove the opts variable to show the browser window
        driver = new ChromeDriver(opts);
        driver.get("http://newtours.demoaut.com");

        System.out.println("******"+driver.getTitle()+"******");
        driver.close();
    }
}
