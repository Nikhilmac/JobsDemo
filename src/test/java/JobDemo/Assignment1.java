package JobDemo;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
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
		WebElement e1 = driver.findElement(By.xpath("//td//div/a/strong[text()=' Faculty of Civil Engineering ']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id='menuItemText32']"));

		Hover(driver, e1);
		HoverandCLick(driver, e1, e2);
		if (driver.getTitle().contains("Institute For Ocean Management"))
			System.out.println("Page title contains :: \"Institute For Ocean Management\" ");
		else
			System.out.println("Page title doesn't contains :: \"Institute For Ocean Management\" ");
		WebElement e3 = driver.findElement(By.xpath("//div//a[text()='Research Themes']"));
		WebElement e4 = driver.findElement(By.xpath("//div[@id='menuItemHilite13']"));

		Hover(driver, e3);
		HoverandCLick(driver, e3, e4);
		if (driver.getTitle().contains("IOM - Institute For Ocean Management"))
			System.out.println("Page title contains \"IOM - Institute For Ocean Management\" ");
		else
			System.out.println("Page title doesn't contains \"IOM - Institute For Ocean Management\" ");

	}

	public static void Hover(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}

	public static void HoverandCLick(WebDriver driver, WebElement eleToHover, WebElement eleToClick) {
		Actions act = new Actions(driver);
		act.moveToElement(eleToHover).click(eleToClick).build().perform();
	}

	public static boolean Exist(WebElement ele) {

		try {
			return ele.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
