/**
 * 
 */
package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Browser Navigation Command
 * Navigate To Command - How to Navigate to URL or How to open a webpage in Selenium Browser?
 * Forward Command - How to browser Forward in Selenium Browser?
 * Back Command - How to browse backward in Selenium Browser?
 * Refresh Command - How to Refresh Selenium Browser?
 *
 */
public class _05_NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution Started -- Initialized Browser");
		WebDriver driver = new ChromeDriver();
		String applicationURL = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(applicationURL);
		driver.findElement(By.xpath("//button[normalize-space()='Home']")).click();
		System.out.println("After clicking on Home Button, the page is navigated to Home Page");
		Thread.sleep(10000);
		driver.navigate().back();
		System.out.println("The page is navigated to Practice Page");
		Thread.sleep(10000);
		driver.navigate().forward();
		System.out.println("The page is navigated to Home Page");
		Thread.sleep(10000);
		driver.navigate().to(applicationURL);
		System.out.println("The page is navigated to main URL");
		Thread.sleep(10000);
		driver.navigate().refresh();
		System.out.println("The page is Refreshed");
		driver.close();
		System.out.println("Execution Ended -- Browser Closed");

	}

}