package praba;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://hes.sands.in/#/auth");
		WebElement login = driver.findElement(By.id("input-email"));
//		login.sendKeys("climate@sands.in");
//		File email = login.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(email, new File("input.png"));
		
		// Get - Height & Width
		System.out.println(login.getRect().getHeight());
		System.out.println(login.getRect().getDimension().getHeight());
		System.out.println(login.getRect().getDimension().getWidth());
		//driver.quit();
		 
		 
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		Set<String> pages = driver.getWindowHandles();
//		Iterator<String> ID = pages.iterator();
//		String parent = ID.next();
//		String Child = ID.next();
//		driver.switchTo().window(Child);
//		driver.get("https://sandsindia.com/");
//		driver.close(); // Close the Current Tab
		
		
		
		
//		WebElement field = driver.findElement(By.id("input-email"));
//		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(field)).getText()); 
//		WebElement ckbox = driver.findElement(By.xpath("//span[text()='Remember me']"));
//	    driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(ckbox)).click();
	
		 
		

	}

}
