
package praba;

import java.net.URL;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver();
//		WebDriver  driver = new FirefoxDriver();
		driver.get("https://hes.sands.in/");
		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("a.text-link")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = \"username\"]")).sendKeys("bescom@sandsindia.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = \"Password\"]")).sendKeys("bescom@123");
		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.xpath("//div/p ")).getText());
		driver.findElement(By.tagName("mat-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span.custom-checkbox")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.tagName("nb-alert")).getText());
//		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".mat-focus-indicator.mat-icon-button.mat-button-base")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".mat-calendar-body-cell-content.mat-calendar-body-selected.mat-calendar-body-today")).click();
//		int i = 1;
//		while (i<=2)
//		{
//		 driver.findElement(By.xpath("//nb-icon[@icon = 'menu-2-outline']")).click();
//		 i++;
//		}
	    driver.findElement(By.xpath("//nb-icon[@class='menu-icon-parent expand-icon fa fa-undefined sub-menu fa-caret-right']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//nb-icon[@class='menu-icon link-only fa fa-building link-only-root ng-star-inserted'])[2]")).click();
	    Thread.sleep(1000);
//		driver.manage().timeouts().implicitlyWait(5, null);
//		driver.findElement(By.cssSelector("div[class = 'header-container']:nth-child(2)")).click();
//		driver.findElement(By.xpath("//a/span [1]")).click();
	    WebElement staticDropdown = driver.findElement(By.id("mat-input-1"));
	    Select dropdown = new Select(staticDropdown);
//	    dropdown.selectByIndex(1);
//	    dropdown.selectByVisibleText("Sub Division");
	    dropdown.selectByValue("1");
	    driver.findElement(By.xpath("(//button[@class='appearance-filled size-tiny status-basic shape-rectangle nb-transition'])[2]")).click();
		Thread.sleep(1000);
	
		
		
//		System.out.println(driver.getCurrentUrl());
//		driver.close(); 
				
		

	}

}
