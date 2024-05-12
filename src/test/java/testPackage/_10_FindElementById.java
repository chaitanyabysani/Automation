/**
 * 
 */
package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * FindElementById
 *
 */
public class _10_FindElementById {
	public static void main(String[] args) {
		System.out.println("Execution Started -- Initialized Browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box/");
	    WebElement element = driver.findElement(By.id("submit"));	
		if(element != null) {
		    System.out.println("Element found by ID");
		}
		driver.quit();
		System.out.println("Execution Ended -- Browser Closed");
		   
	   }
	

	}

