package sands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Greenkart {
	
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
	
	driver.findElement(By.xpath("//tr/th[1]")).click();
	
	
}
	
	
	

}
