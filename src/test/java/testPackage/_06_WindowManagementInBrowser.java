/**
 * 
 */
package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 	There are several instances in test automation wherein one might need to open a particular link in a new tab or window to perform 	certain actions. To achieve this in Selenium 3, QAs had to create a new driver object and then perform the switch operation using 	the WindowHandle method to perform subsequent steps.

	This is set to change in Selenium 4 as it comes with a new API – newWindow that allows users to create and switch to a new 	window/tab without creating a new WebDriver object.
 *
 */
public class _06_WindowManagementInBrowser {
	public static void main(String[] args) {
		System.out.println("Execution Started -- Initialized Browser");
		WebDriver driver = new ChromeDriver();
		String applicationURL = "https://www.google.com/";
		driver.get(applicationURL);
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Opens BrowserStack homepage in the newly opened window
		driver.navigate().to("https://www.browserstack.com/");
		driver.quit();
		System.out.println("Execution Ended -- Browser Closed");

	}

}
