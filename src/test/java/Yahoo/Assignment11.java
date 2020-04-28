package Yahoo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assignment11 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://annauniv.edu/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		try {
			driver.findElement(By.linkText("Scans")).click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("Departments")));
		}

		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//td//div/a/strong[text()=' Faculty of Civil Engineering ']"));
		actions.moveToElement(ele);
		actions.click().build().perform();
		
		WebElement subLink=driver.findElement(By.xpath("//div[@id='menuItemText32']"));
        actions.moveToElement(subLink);
        actions.click();
        actions.perform();

	}
	

}
