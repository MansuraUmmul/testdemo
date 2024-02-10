package TestDemo.TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;

public class BrowserOpener {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the browser you want to open (chrome/firefox/edge):");
        String browserChoice = scanner.nextLine().toLowerCase();

        WebDriver driver = null;

        switch (browserChoice) {
            case "chrome":
                
                driver = new ChromeDriver();
                break;
            case "firefox":
                
                driver = new FirefoxDriver();
                break;
            case "edge":
                
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser choice. Please choose chrome/firefox/edge.");
                scanner.close();
                return;
        }

        // Navigate to a website (you can change this URL)
        driver.get("https://www.example.com");

        // Optional: Add more actions or automation steps here

        // Close the browser
        driver.quit();

        scanner.close();
    }
}
