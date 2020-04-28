package Yahoo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assignment3 {
	WebDriver driver;

	@Test
	public void logingmail() {
		driver.get("http://google.com");
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).sendKeys("nikhil.qa124");
		driver.findElement(By.xpath("//div//span[text()='Next']")).click();
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.get("http://google.com");
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
