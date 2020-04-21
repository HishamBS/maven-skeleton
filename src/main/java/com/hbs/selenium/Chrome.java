package com.hbs.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver = new ChromeDriver();

        // setting window Dimensions
        //Dimension p1080 = new Dimension(1920,1080 );
        //driver.manage().window().setSize(p1080);
        // maximaizing browser window
        //driver.manage().window().setSize(p1080);



        driver.get("http://newtours.demoaut.com");
        // getting web page elements
        // should not use cssSelector in practice , because they always change
        WebElement userNameField = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]"));
        WebElement loginButton = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=image]"));

        // interacting with web elements
        userNameField.sendKeys("My name Is FooBar");
        loginButton.click();

        System.out.println("******"+driver.getTitle()+"******");
        driver.close();
    }
}
