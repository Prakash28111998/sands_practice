package com.simplilearn.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected static WebDriver driver;
    protected Actions a;

    @BeforeMethod
    public void setUp() {
        driver = SingletonWebDriver.getDriver();
        a = new Actions(driver);
    }

    @AfterMethod
    public void tearDown() {
        SingletonWebDriver.closeDriver();
    }

}
