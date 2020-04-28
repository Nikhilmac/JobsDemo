package Yahoo;
/**
 * WebElement element;
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://annauniv.edu/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div/a[text()='Departments']")).click();
		Actions action = new Actions(driver);
		element = driver.findElement(By.linkText("Departments"));
		action.moveToElement(element);
		action.click().build().perform();
	
 */

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Assignment1 {
	WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.linkText("Departments")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://annauniv.edu/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
