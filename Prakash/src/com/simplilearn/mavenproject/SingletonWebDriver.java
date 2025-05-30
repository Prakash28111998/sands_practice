package com.simplilearn.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SingletonWebDriver {
	
	
	 private static WebDriver driver;
	   
	    // Private constructor to prevent instantiation from other classes
	    private SingletonWebDriver() {}

	    // Public method to get the single instance of the WebDriver
	 @BeforeSuite
	    public static WebDriver getDriver() {
	        if (driver == null) {
	            synchronized (SingletonWebDriver.class) {
	                if (driver == null) {
	                    // Initialize the WebDriver instance if it doesn't exist
	                    //FirefoxOptions options = new FirefoxOptions();
	                	ChromeOptions option = new ChromeOptions();
	                	option.addArguments("-private"); // Open in private mode
	                   // driver = new FirefoxDriver(options);
	                    driver= new ChromeDriver(option);
	                    driver.manage().window().maximize();
	                    driver.get("https://www.sandsindia.com/");
	                    //driver.get("https://www.example.com");  // Replace with your URL
	                }
	            }
	        }
	        return driver;  // Return the existing WebDriver instance
	    }

	    // Method to close the WebDriver instance
	 @AfterSuite
	    public static void closeDriver() {
	        if (driver != null) {
	            driver.quit();  // Close the browser
	            driver = null;  // Nullify the driver instance to allow GC
	        }
	    }

}
