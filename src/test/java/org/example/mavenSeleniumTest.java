package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class mavenSeleniumTest extends BaseClass {
    @Test
    public void goToWeb(){
        driver.get("https://www.kohls.com/");
    }
@Test
    public void primeDayButton(){
        driver.get("https://www.kohls.com/");
        String actualTitle= driver.getTitle();
        String expectedTitle="Kohl's | Shop Clothing, Shoes, Home, Kitchen, Bedding, Toys & More";
    Assert.assertEquals(actualTitle,
            expectedTitle);


    //Actions scroll=new Actions(driver);
    //driver.findElement(By.name("A delivery, order or return"));
    //scroll.click(driver.findElement(By.name("A delivery, order or return"))).build().perform();


    }

    }
