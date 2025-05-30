package com.simplilearn.mavenproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Industrial_Solutions {
	WebDriver driver ;
	Actions a ;

	String current_url() {
		driver.getCurrentUrl();
		return current_url();
	}

	// function
	void clickInds() {
		a.moveToElement(driver.findElement(Industrial_Solutions)).build().perform();
	}

	By Industrial_Solutions = By.xpath("//a[text()='Industrial Solutions']");
	By Condition_Monitoring_System = By.xpath("//a[text()='Condition Monitoring System']");
	By argus = By.linkText("ARGUS - Vibration Analyzer");
	By SIQ = By.linkText("3SIQ- Current Quality Analyzer");
	By nergy_Management_System = By.xpath("//a[text()='Energy Management System']");
	By EnMS = By.linkText("EnMS");

	By Solar_Energy = By.linkText("Solar Energy Monitoring System");

	@Test
	public void IndustrialSolutions() {

		// System.out.println("a ="+a);

		clickInds();
		a.moveToElement(driver.findElement(Condition_Monitoring_System)).build().perform();
		driver.findElement(argus).click();
		assertEquals(current_url(), All_Url_page.Argus);

		clickInds();
		a.moveToElement(driver.findElement(Condition_Monitoring_System)).build().perform();
		driver.findElement(SIQ).click();
		assertEquals(All_Url_page.SIQ, driver.getCurrentUrl());
	}

	@AfterTest
	public void Energy_Management_System() {
		clickInds();
		a.moveToElement(driver.findElement(nergy_Management_System)).build().perform();
		driver.findElement(EnMS).click();
		assertEquals(All_Url_page.enms, driver.getCurrentUrl());

		clickInds();
		a.moveToElement(driver.findElement(nergy_Management_System)).build().perform();
		driver.findElement(Solar_Energy).click();
		assertEquals(All_Url_page.solar, driver.getCurrentUrl());

	}

}
