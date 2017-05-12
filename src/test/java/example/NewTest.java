package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() throws InterruptedException {
//		driver.get("http://demo.guru99.com/selenium/guru99home/");
//		String title = driver.getTitle();				 
//		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
		driver.navigate().to("http://newtours.demoaut.com/");
		String strPageTitle = driver.getTitle();
		Thread.sleep(3000);
		System.out.println("Page title is: " + strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Welcome: Mercury Tours"), "Page title does not match");
		WebElement element = driver.findElement(By.xpath("//input[(@name='userName')]"));
		element.sendKeys("mercury");
		 driver.findElement(By.name("password")).sendKeys("mercury");

		// Click on login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		String strPageTitle1 = driver.getTitle();
		System.out.println("Login is successful: " + strPageTitle1);
	}
	
	@Test
	public void Test1() throws InterruptedException{
		/*WebElement element = driver.findElement(By.xpath("//input[(@name='userName')]"));
		element.sendKeys("mercury");
		 driver.findElement(By.name("password")).sendKeys("mercury");

		// Click on login button
		driver.findElement(By.name("login")).click();*/
		Thread.sleep(5000);
		String strPageTitle1 = driver.getTitle();
		System.out.println("Login is successful: " + strPageTitle1);
	}
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
	String Browsertype = "Chrome1";
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