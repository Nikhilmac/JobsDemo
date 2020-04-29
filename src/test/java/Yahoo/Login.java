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

/***
 * All these assignments to be done in Chrome browser.
You should not use Thread.sleep() or implict wait.

Use only explicit Wait.



Assignment1 
- Anna assignment
1. goto http://annauniv.edu/
2. click on "Departments" link
3. Goto "Faculty Of Civil Engineering" and click on "Institute for Ocean Management"
4. Verify the page title.
5. Goto "Research Themes" options and Click "Coastal Pollution Monitoring and Hazards"
6. Verify the page title.

Assignment2:
- go to triphobo.com website
- Click "Later" in be updated box (this may not appear, then ignore)
- Click on "PLAN YOUR NEXT VACATION" button on the homepage
- Type Where do you want to go? field, Houston in Texas
- Select Start and End date of your journey
- Click on button "Start Planning"
- Click on "Next - About Your Trip"
- Click on "Suggest an itinerary with "Things to do ""
- Click on "Next" thrice
- Click on "Wandering Solo"
- Click on "Next Trip Overview"
- Click on "Editable View"
- Drag "Children's museum to day 3"
- Click on Save plan -> Finish Planning


Assignment3
1. Go to google.com
2. Click on Gmail link such that it opens in the same window in a new tab
3. then login into Gmail.
4. Come back to google.com tab and search on "Selenium WebDriver"

 * 
 * 
 * 
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
