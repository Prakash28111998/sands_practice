package sands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	public static void main(String[] args) {
//		System.setProperty("Webdriver.chrome.driver", "")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sandsindia.com/");
		driver.findElement(By.xpath(""));
		
	}

}
