package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BrowserCommands {
	WebDriver driver;

	@BeforeClass
	public void preConditionsForAllTests() {
		System.out.println("I am in Before Class");
		System.setProperty("webdriver.chrome.driver",
				"test\\resources\\chromedriver-93.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void cleanUpAfterAllTestsAreExecuted() {
		System.out.println("I am in After Class");
		driver.quit();
	}

	@Test
	public void browserCommands() {
		System.out.println("I  am in Test");
		driver.get("https://nichethyself.com/tourism/home.html");
		String currentUrl = driver.getCurrentUrl();
		String getPageSource = driver.getPageSource();
		// Study cookie and size related methods
		driver.navigate().refresh();
		driver.get("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.yahoo.com");

	}

}
