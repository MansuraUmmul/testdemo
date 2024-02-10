package TestDemo.TestDemo;

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



	public class OrangeTest112Demo  {
		WebDriver driver;
		
		@BeforeClass
		//@Test(priority=10)
		void openApp()
		{
			
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		
		@Test(priority=50)
		void login()
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}
		
		@Test(priority=60)
		void logout() {
		    // Click on the user dropdown to open the options
		    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();

		    // Click on the "Logout" option
		    driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}

		
		@AfterClass
		//@Test(priority=100)
		void closeApp()
		{
			driver.quit();
		}
		
		
	}


