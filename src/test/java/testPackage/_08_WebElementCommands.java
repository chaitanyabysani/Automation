/**
 * 
 */
package testPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Clear Command
 * SendKeys Command
 * Click Command
 * IsDisplayed Command
 * IsEnabled Command
 * IsSelected Command
 * Submit Command
 * GetText Command
 * getTagName Command
 * getCssValue Command
 * getAttribute Command
 * getSize Command
 * getLocation Command
 *
 */
public class _08_WebElementCommands {
	public static void main(String[] args) {
		System.out.println("Execution Started -- Initialized Browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textBox.click();
		textBox.sendKeys("Selenium");
		textBox.clear();
		WebElement openTabButton = driver.findElement(By.xpath("//a[@id='opentab']"));
		boolean status = openTabButton.isDisplayed();
		System.out.println("The status of button is: " +status);
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		boolean checkBoxStatus = checkBox.isEnabled();
		System.out.println("The status of button is: " +checkBoxStatus);
		boolean checkBoxSelectionStatus = checkBox.isSelected();
		System.out.println("The status of button is: " +checkBoxSelectionStatus);
		WebElement dropDownText = driver.findElement(By.xpath("//legend[normalize-space()='Dropdown Example']"));
		System.out.println("Text is: " +dropDownText.getText());
		System.out.println("Tag Name is: " +dropDownText.getTagName());
		System.out.println("Background Color is: " +dropDownText.getCssValue("background-color"));
		System.out.println("Font Size is: " +dropDownText.getCssValue("font-size"));
		System.out.println("Title is: " +openTabButton.getAttribute("title"));
		System.out.println("Value of classValue attribute: " +openTabButton.getAttribute("class"));
		System.out.println("Value of classNameValue attribute: " +openTabButton.getAttribute("className"));
		System.out.println("Value of xpathValue attribute: " +openTabButton.getAttribute("xpath"));
		System.out.println("Value of idValue attribute: " +openTabButton.getAttribute("id"));
		WebElement openWindowButton = driver.findElement(By.xpath("//button[@id='openwindow']"));
		Dimension dimensions = openWindowButton.getSize();
		System.out.println("Height :" +dimensions.height +  "Width : "+ dimensions.width);
		Point point = openWindowButton.getLocation();
		System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
		driver.quit();
		System.out.println("Execution Ended -- Browser Closed");
		
		

	}

}
