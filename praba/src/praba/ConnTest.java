package praba;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sandsindia.com/");
//		System.out.println("Hi");
//		String url = driver.findElement(By.cssSelector("a[class*='menu_active']")).getAttribute("href");
//		Thread.sleep(2000);
//		@SuppressWarnings("deprecation")
		driver.findElement(By.cssSelector("a[class*='menu_active']")).click();
//		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
//		System.out.println("Hi");

//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int x = conn.getResponseCode();
//		System.out.println(x);
//		

		



	}

}
