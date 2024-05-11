package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_InitializeFireFoxBrowser {

	public static void main(String[] args) {
		
		System.out.println("Execution Started -- Openeing Firefox Browser");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.quit();
		System.out.println("Execution ended -- Closing Firefox Browser");

	}

}
