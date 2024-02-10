package TestDemo.TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicInteractionElements {

    public static void main(String[] args) {


        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://example.com");

        // Perform link operation
        WebElement linkElement = driver.findElement(By.linkText("Example Link"));
        linkElement.click();

        // Perform edit box operation
        WebElement textBox = driver.findElement(By.id("inputBox"));
        textBox.sendKeys("Testing Selenium");

        // Perform button operation
        WebElement button = driver.findElement(By.id("submitButton"));
        button.click();

        // Perform text operation
        WebElement textElement = driver.findElement(By.tagName("p"));
        String text = textElement.getText();

        // Perform image operation
        WebElement imageElement = driver.findElement(By.tagName("img"));
        String imageUrl = imageElement.getAttribute("src");

        // Perform frame operation
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameElement);

        // Perform checkbox operation
        WebElement checkbox = driver.findElement(By.id("checkBox"));
        checkbox.click();

        // Perform drop-down operation
        WebElement dropdown = driver.findElement(By.id("dropdownList"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");

        // Perform radio button operation
        WebElement radioButton = driver.findElement(By.id("radioButton"));
        radioButton.click();

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}



