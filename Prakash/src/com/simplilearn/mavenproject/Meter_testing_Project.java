package com.simplilearn.mavenproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Meter_testing_Project extends BaseTest{
	// public static
	  WebDriver driver ;//= Sands.driver;
	  
	  
	  // = new Sands();
	
	 
	// Mouse action
	  Actions a ;//= new Actions(driver);
	  
	
	
	 JavascriptExecutor ja = (JavascriptExecutor) driver;
	 

	void screen_short(String screen) throws IOException {
		//driver=SingletonWebDriver.getDriver();
		a=new Actions(driver);
		
		// String screen = "Image"
		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("C://SS1115/automation_testing_screenshort/" + screen + ".png"));

	}

	public  void mouse_action() {
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Utility Solutions']"))).build().perform();
	}

	public  void mouse_action_GPS_time_server() {
		a.moveToElement(driver.findElement(By.linkText("GPS Time Server"))).build().perform();
	}

	public void mouse_action_GPS_Clock() {
		a.moveToElement(driver.findElement(By.linkText("GPS Clock"))).build().perform();
	}

	void large_display_indicater() {
		mouse_action();
		a.moveToElement(driver.findElement(By.linkText("Large Display Indicators"))).build().perform();
	}

	@Test
	public void product_Meter_testing() throws InterruptedException {
		
		mouse_action();
		a.moveToElement(driver.findElement(By.linkText("Meter Testing Products"))).build().perform();
		driver.findElement(By.linkText("Portable Reference Standard Meters")).click();
		assertEquals(All_Url_page.portable_standered_meter, driver.getCurrentUrl());
		assertEquals(driver.findElement(By.id("PG016_R05C01")).getText(),
				driver.findElement(By.id("PG016_R21C01")).getText());
		driver.findElement(By.id("PG016_R05C01_02")).click();
		assertEquals(driver.findElement(By.id("PG016_R05C02")).getText(),
				driver.findElement(By.id("PG016_R21C02")).getText());
		ja.executeScript("window.scrollBy(0,500)");
		ja.executeScript("window.scrollBy(0,500)");
	}

	/*
	 * public void product_Meter_testing() throws InterruptedException {
	 * mouse_action();
	 * a.moveToElement(driver.findElement(By.linkText("Meter Testing Products"))).
	 * build().perform(); driver.findElement(By.linkText("SPRS")).click();} public
	 * void Meter_Reading_Product_TPRS() throws InterruptedException {
	 * mouse_action();
	 * a.moveToElement(driver.findElement(By.linkText("Meter Testing Products"))).
	 * build().perform();
	 * //driver.findElement(By.linkText("Meter Testing Products")).click();
	 * driver.findElement(By.linkText("TPRS")).click();} public void
	 * Meter_Reading_Product_Smart_Smart_TPRS() throws InterruptedException {
	 * mouse_action();
	 * a.moveToElement(driver.findElement(By.linkText("Meter Testing Products"))).
	 * build().perform();
	 * //driver.findElement(By.linkText("Meter Testing Products")).click();
	 * driver.findElement(By.linkText("Smart TPRS")).click(); }
	 */
	@Test
	public void GPS_Time_Server_SYNTIME_GPS_Time_Server() throws IOException {
		mouse_action();
		mouse_action_GPS_time_server();
		driver.findElement(By.xpath("//a[text()='SYNTIME- GPS Time Server']")).click();
		assertEquals(driver.getCurrentUrl(), All_Url_page.SYNETIMEGPS);
		// screenshort//
		screen_short("GPS_Time_Server_SYNTIME_GPS_Time_Server");
	}

	@Test
	public void GPS_Time_Server_GPS_Time_Server_DIN_RAIL() throws IOException {
		mouse_action();
		mouse_action_GPS_time_server();
		driver.findElement(By.linkText("GPS Time Server - DIN RAIL")).click();
		assertEquals(driver.getCurrentUrl(), All_Url_page.DINRIAL);
		screen_short("GPS_Time_Server_GPS_Time_Server_DIN_RAIL");
	}

	@Test
	public void NTP_SNTP_Converter() throws IOException {
		mouse_action();
		mouse_action_GPS_time_server();
		driver.findElement(By.linkText("IRIG B TO NTP/SNTP Converter")).click();
		assertEquals(driver.getCurrentUrl(), All_Url_page.SNTP);
		screen_short("NTP_SNTP_Converter");
	}

	@Test
	public void IRIG_B_Booster() throws IOException {
		mouse_action();
		mouse_action_GPS_time_server();
		driver.findElement(By.linkText("IRIG B Booster")).click();
		assertEquals(driver.getCurrentUrl(), All_Url_page.BBoost);
		screen_short("IRIG_B_Booster");
	}

	@Test
	public void IRIG_B_RS485_Converter() throws IOException {
		mouse_action();
		mouse_action_GPS_time_server();
		WebElement RS485 = driver.findElement(By.linkText("IRIG-B TTL to RS485 Converter"));
		RS485.click();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains(All_Url_page.RS485);
		assertTrue(contains);
		// assertEquals(currentUrl, All_Url_page.RS485);
		screen_short("IRIG_B_RS485_Converter");
	}

	@Test
	public void GPS_Clock() {
		mouse_action();
		mouse_action_GPS_time_server();
		// mouse_action_GPS_Clock();
		a.moveToElement(driver.findElement(By.linkText("GPS Clock"))).build().perform();
		driver.findElement(By.linkText("GPS Slave Clock")).click();
	}

	@Test
	public void GPS_Wireless_Clock() {
		mouse_action();
		mouse_action_GPS_time_server();
		mouse_action_GPS_Clock();
		driver.findElement(By.linkText("GPS Wireless Clock")).click();
	}

	@Test
	public void GPS_Standalone_Clock() {
		mouse_action();
		mouse_action_GPS_time_server();
		mouse_action_GPS_Clock();
		driver.findElement(By.linkText("GPS Standalone Clock")).click();
	}

	@Test
	public void frequency_kilovolte_Mega_displays() {
		large_display_indicater();
		driver.findElement(By.linkText("Frequency Display")).click();
		large_display_indicater();
		driver.findElement(By.linkText("Kilovolt Display")).click();
		large_display_indicater();
		driver.findElement(By.linkText("Mega Watt Display")).click();
	}

	@Test
	private void stator() {
		// TODO Auto-generated method stub
		a.moveToElement(driver.findElement(By.linkText("Stator Protection Kit"))).build().perform();
	}

	@Test
	public void Stator_Protection_Kit() {
		mouse_action();
		stator();
		driver.findElement(By.linkText("20Hz Injection Kit")).click();
		mouse_action();
		stator();
		driver.findElement(By.linkText("20Hz Injection Kit Monitoring System")).click();
	}

	@Test
	public void CRUX_Meter_Data_Analytics() {
		mouse_action();
		driver.findElement(By.linkText("CRUX- Meter Data Analytics")).click();
	}

	@Test
	public void HVLWTK() {
		mouse_action();
		driver.findElement(By.linkText("High Volatge Live Wire Testing Kit")).click();
	}

}
