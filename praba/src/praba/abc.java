package praba;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class abc {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver  driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.sandsindia.com/");
		SoftAssert so = new SoftAssert();
		String z=driver.findElement(By.cssSelector("a[class*='menu_active']")).getAttribute("href");
		HttpURLConnection c =(HttpURLConnection)new URL(z).openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int s=c.getResponseCode();
        System.out.println(s);

	}


	
}
