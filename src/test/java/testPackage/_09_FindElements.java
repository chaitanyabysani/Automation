/**
 * 
 */
package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * findElement(): This method uniquely finds a web element on the web page
 * findElements(): This method finds a list of web elements on the web page
 *
 */
public class _09_FindElements {
	public static void main(String[] args) {
		System.out.println("Execution Started -- Initialized Browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box/");
		// Find elements using tag name
		   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));			
		   if(allInputElements.size() != 0) 
		   {
			   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");				
			   for(WebElement inputElement : allInputElements) 
			   {
				   System.out.println(inputElement.getAttribute("placeholder"));
			   }
		   }
		   driver.quit();
		   System.out.println("Execution Ended -- Browser Closed");
		   
	}

}
