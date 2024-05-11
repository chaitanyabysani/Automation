/**
 * 
 */
package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Get-Command - How to Open a WebPage in Selenium?
 * Get Title Command - How to get the Title of the Webpage in Selenium?
 * Get Current URL Command - How to read the URL of the Webpage in Selenium?
 * Get Page Source Command - How to read the page source of the WebPage in Selenium?
 * Close Command - How to close the Browser in Selenium?
 * Quit Command - How to close all the Browser's Window in Selenium?
 *
 */
public class _04_BrowserCommands {
	public static void main(String[] args) {

		System.out.println("Execution Started -- Initialized Browser");
		WebDriver driver = new ChromeDriver();
		String URL = "https://demoqa.com/";
		driver.get(URL);
		String pageTitle = driver.getTitle();
		int titleLength = pageTitle.length();
		System.out.println("Page Title is: " +pageTitle);
		System.out.println("Title Length is: " +titleLength);
		String currentPageURL = driver.getCurrentUrl();
		if(currentPageURL.equals(URL)) {
			System.out.println("Correct page is opened");
		}
		else {
			System.err.println("Wrong page opened");
			System.out.println("Actual URL is : " + currentPageURL); 
			System.out.println("Expected URL is : " + URL);
		}
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		
		System.out.println("PageSource length is: " +pageSourceLength);
		
		driver.close();
		System.out.println("Execution Ended -- Browser Closed");
				

	}

}
