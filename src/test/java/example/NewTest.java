package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}

	@BeforeTest
	public void beforeTest() {
	String Browsertype = "Chrome";
	if (Browsertype == "Chrome" ) {

			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome browser is started");
	}
	else {
			System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox browser is started");

		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}