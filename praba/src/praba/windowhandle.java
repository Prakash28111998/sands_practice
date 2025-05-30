package praba;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver1 = new ChromeDriver();
		driver1.get("https://www.sandsindia.com/");
		driver1.manage().window().maximize();
		// Entire web page link Count
		System.out.println(driver1.findElements(By.tagName("a")).size()); 
		
		// Footer page link count
		WebElement footer = driver1.findElement(By.cssSelector("div.isocontain"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		// Click on the Link
		for(int i=0;i<footer.findElements(By.tagName("a")).size();i++)
		{
//			String clickontab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).click();
//			footer.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			System.out.println(driver1.getTitle());
			Thread.sleep(3000L);

		}
		
		
//		 Navigate the window
		Set<String> nav = driver1.getWindowHandles();
		Iterator<String> it= nav.iterator();
		while (it.hasNext())
		{
			driver1.switchTo().window(it.next());
			System.out.println(driver1.getTitle());
		}
		   
//		driver1.close();

	}

}
