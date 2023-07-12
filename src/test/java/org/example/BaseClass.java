package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;
    public long implicitlyWait=30;
    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.driver.chromedriver", "/Users/saida/Documents/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
    }

}