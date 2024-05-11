package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _03_InitializeEdgeBrowser {

	public static void main(String[] args) {
		
		System.out.println("Execution Started -- Openeing Edge Browser");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.quit();
		System.out.println("Execution Ended -- Closing Edge Browser");

	}

}
