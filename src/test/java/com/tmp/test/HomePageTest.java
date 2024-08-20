package com.tmp.test;

import com.tmp.config.ConfigFactory;
import com.tmp.driver.Driver;
import com.tmp.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {

    @Test
    public void titleValidationTest() throws InterruptedException {

        DriverManager.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(ConfigFactory.getConfig().username());
        DriverManager.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigFactory.getConfig().password());
        DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");

    }




}
