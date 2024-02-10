package TestDemo.TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {       
        driver = new ChromeDriver();
    }

    @Test
    public void testRadioButton() {
        driver.get("http://test.rubywatir.com/radios.php"); 

        WebElement radioButton = driver.findElement(By.id("radioId")); 
        radioButton.click();

        Assert.assertTrue(radioButton.isSelected(), "The radio button should be selected.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

