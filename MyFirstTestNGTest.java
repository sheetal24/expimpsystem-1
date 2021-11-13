package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyFirstTestNGTest {
	WebDriver driver; //Browser

	@BeforeClass
	public void preConditionsForAllTest() {
		System.out.println("I am in Before Class");
		System.setProperty("webdriver.chrome.driver",
				"C:\\temp\\webdriverJul21batch\\test\\resources\\chromedriver-93.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\temp\\webdriverJul21batch\\test\\resources\\geckodriver.exe");
//		driver = new ChromeDriver();		
		driver = new FirefoxDriver();
	}
	
	
	@AfterClass
	public void cleanUpAfterAllTestsAreExecuted() {
		System.out.println("I am in After Class");
		driver.quit();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I  am in After Method");		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I  am in Before Method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I  am in Before Method");
	}

	@Test
	public void testNicheThyselfLogin() {
		System.out.println("I  am in Test");
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		System.out.println("Tag of username is " + user.getTagName());
		System.out.println("type attrubute of username is " + user.getAttribute("type"));
		System.out.println("Name attrubute of username is " + user.getAttribute("name"));
		System.out.println("Placeholder attrubute of username is " + user.getAttribute("placeholder"));
		user.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");// Method
																	// chaining
																	// in Java
		driver.findElement(By.name("username")).submit();// submitting the form.
		
//		driver.findElement(By.id("loginsection")).findElement(By.name("loginform")) //search inside an element having id attribute loginsection
		driver.findElement(By.name("loginform"));//Entire page

		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();

		/*
		 * if (expectedTitle.equals(actualTitle))
		 * System.out.println("Test Case Passed"); else
		 * System.out.println("Test Case Failed");
		 */		
		assertEquals(actualTitle, expectedTitle);
	}

	 @Test
	public void googleTest() {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Today is Saturday");
	}

@Test
	public void testNicheThyselfLogin() {
		System.out.println("I  am in Test");
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		System.out.println("Tag of username is " + user.getTagName());
		System.out.println("type attrubute of username is " + user.getAttribute("type"));
		System.out.println("Name attrubute of username is " + user.getAttribute("name"));
		System.out.println("Placeholder attrubute of username is " + user.getAttribute("placeholder"));
		user.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");// Method
																	// chaining
																	// in Java
		driver.findElement(By.name("username")).submit();// submitting the form.
		
//		driver.findElement(By.id("loginsection")).findElement(By.name("loginform")) //search inside an element having id attribute loginsection
		driver.findElement(By.name("loginform"));//Entire page

		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();

		/*
		 * if (expectedTitle.equals(actualTitle))
		 * System.out.println("Test Case Passed"); else
		 * System.out.println("Test Case Failed");
		 */		
		assertEquals(actualTitle, expectedTitle);
	}

	 @Test
	public void googleTest() {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Today is Saturday");
	}


}
