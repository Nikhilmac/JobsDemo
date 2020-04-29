package Yahoo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.triphobo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Plan Your Next Vacation")).click();

		WebElement ele1 = driver.findElement(By.xpath("//div/input[@type='text']"));
		ele1.sendKeys("Texas");
	//	isElementLoaded(driver, ele1);

		// driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys(Keys.ENTER);
		WebElement ele2 = driver.findElement(By.xpath("//div/ul/li/span[text()='Texas, United States']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele2);
		act.click().build().perform();
		isElementLoaded(driver, ele1);
		isElementLoaded(driver, ele2);
//		// waitForElement(ele2, driver);
//		WebElement ele3 = driver.findElement(By.xpath("//div/img[@alt='Houston']"));
//		act.moveToElement(ele3);
//		act.click().build().perform();
//		// waitForElement(ele3, driver);
//		driver.findElement(By.xpath("//div/span/input[@placeholder='Start Date']")).click();
//		driver.findElement(By.xpath("//tr//td[@data-month='4']/a[text()='2']")).click();
//		driver.findElement(By.xpath("//div/span/input[@placeholder='End Date']")).click();
//		driver.findElement(By.xpath("//tr//td[@data-month='4']/a[text()='28']")).click();
//		driver.findElement(By.xpath("//div/span[@class='button p-color full-width start-planning']")).click();
//		WebElement ele4 = driver.findElement(By.xpath("// div[text()='About Your Trip']"));
//		act.moveToElement(ele4);
//		act.click().build().perform();
//		driver.findElement(By.xpath("//div[@class='profile select-profile-1 selected ']//span[text()='Things to do']"))
//				.click();
//		driver.findElement(By.xpath("// div[text()='About You']")).click();
//		driver.findElement(By.xpath("// div[@class='entry-point solo-ep']")).click();
//		driver.findElement(By.xpath("// div[text()='Trip Overview']")).click();
//		Thread.sleep(20000);
//		WebElement ele5 = driver.findElement(By.xpath("//div//li//span[text()='Editable view']"));
//		act.moveToElement(ele5);
//		act.click().build().perform();
//		WebElement element = driver.findElement(By.xpath("//div[text()='Childrens Museum Of Houston']"));
//		WebElement target = driver.findElement(By.xpath("//th//div//p[contains(text(),'Day 3')]"));
//		(new Actions(driver)).dragAndDrop(element, target).perform();
//		driver.findElement(By.xpath("//div//span[contains(text(),'Save Plan')]")).click();
//		driver.findElement(By.xpath("//div//span[text()='Finish Planning']")).click();
	}

	public static WebElement isElementLoaded(WebDriver driver, WebElement elementToBeLoaded) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element;
	}
}
