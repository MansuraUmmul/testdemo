package TestDemo.TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAuto {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com");
        driver.findElement(By.linkText("Selectable")).click();
        Thread.sleep(2000);

        WebElement fr = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(fr);

        driver.findElement(By.xpath("//*[@id='selectable']/li[5]")).click();
       

       

     
    }
}
