package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_InitializeChromeBrowser {

	public static void main(String[] args) {
		
		System.out.println("Execution Started -- Openeing Chrome Browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.quit();
		System.out.println("Execution Ended -- Closing Chrome Browser");
		
	}

}
