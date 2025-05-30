package praba;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import ch.qos.logback.core.joran.action.Action;

public class flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver  driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[1]")).click();
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
		driver.findElement(By.cssSelector(".css-76zvg2.r-cqee49.r-ubezar.r-1kfrs79.r-1ozqkpa")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'])[25]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'])[14]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
        if(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).getAttribute("style").contains("0px"))
        {
        	System.out.println("Is Deselected");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[58]")).click();
        Thread.sleep(1500);
        int k=1;
        int l=1;
        while(k<3)
        {
        	driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
        	k++;
        }
        while(l<=2)
        {
        	driver.findElement(By.cssSelector("div[data-testid='Children-testID-plus-one-cta']")).click();
        	l++;
        }
//        Assert.assertEquals("driver.findElement(By.cssSelector(\"div[data-testid='Adult-testID-plus-one-cta']\"))", "3 Adults");
//        Assert.assertEquals("driver.findElement(By.cssSelector(\"div[data-testid='Children-testID-plus-one-cta']\"))", "2 Children");
        
        
       
        
	}

}
