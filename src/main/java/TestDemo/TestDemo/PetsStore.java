package TestDemo.TestDemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class PetsStore {
	WebDriver driver;
	
	//@BeforeClass
	@Test(priority=10)
	void openApp()
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
	}
	
	@Test(priority=50)
	void login()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("j2ee");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("j2ee");
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	}
	
	
	@Test(priority=60)
	void logout() {
	    driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	}


	//@AfterClass
	@Test(priority=100)
	void closewindow()
	{
		driver.quit();
	}
	
	
}
