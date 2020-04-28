package Yahoo;

/**
 * 1. Create a new project on IDE
2. Set it up for Selenium and TestNG and automate the following scenario using TestNG
3. Go to http://login.yahoo.com
4. Type username as ketanvj
5. Click on next button
6. Type password as 1235232
7. Click on Next button


 */

/**
 * Ketan J1. Go to - http://selenium-examples.nichethyself.com/customised.html
2. Identify the locator of England checkbox


 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Login {
	public WebDriver driver;

	@Test
	public void f() {
		WebElement element;
		driver.findElement(By.id("login-username")).sendKeys("testingqa124");
		driver.findElement(By.id("login-signin")).submit();
	//	driver.findElement(By.id("login-signin")).submit();

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Automation@124");
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-signin\"]"))).submit();

		//driver.findElement(By.name("password")).sendKeys("Automation@124");
		driver.findElement(By.xpath("//div/button[@id='login-signin']")).click();

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(50000);
		// System.out.println("Login Successfull");
		// driver.close();
	}

}
