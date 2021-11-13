package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; // It is an interface in java
		System.setProperty("webdriver.chrome.driver",
				"C:\\temp\\webdriverJul21batch\\test\\resources\\chromedriver-93.exe");
		driver = new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");// Method
																	// chaining
																	// in Java
		driver.findElement(By.name("username")).submit();// submitting the form.

		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle))
			System.out.println("Test Case Passed");
		else
			System.out.println("Test Case Failed");
		
		
		
		
		// driver.quit();
		// WebDriver driver = new WebDriver();
		// driver.quit();
		// WebDriver driver = new WebDriver();
		// driver.quit();
		// WebDriver driver = new WebDriver();
		// driver.quit();
		// WebDriver driver = new WebDriver();
		// driver.quit();
		// WebDriver driver = new WebDriver();
		// driver.quit();
		// WebDriver driver = new WebDriver();
		// driver.quit();
		// WebDriver driver = new WebDriver();




	}

}
