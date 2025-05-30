package praba;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class photo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(shot,new File("C:\\SS1115\\1234.png"));
//		String x = driver.findElement(By.cssSelector("a[aria-label=\"Contact Us\"]")).getAttribute("href");
//		HttpURLConnection y =(HttpURLConnection) new URL(x).openConnection();
//		y.setRequestMethod("HEAD");
//		y.connect();
//		int res = y.getResponseCode();
//		System.out.println(res);
//		HttpURLConnection y =(HttpURLConnection)new URL(x).openConnection();
//		y.setRequestMethod("HEAD");
//		y.connect();
//		int resp = y.getResponseCode();
//		System.out.println(resp);
//        		

	}

}
