package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitTest {
	
	@Test
	public void UserWillAbleToOpenThePage()  throws Exception   {
		
		//Set the properties of chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.cssSelector("input[placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
		
		
		
	}

}
