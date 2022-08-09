package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	private static long timeunits;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://epfindia.gov.in/site_en/index.php");
		Actions	act=new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Establishme"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]")).click();
//
//		WebDriverWait w=new WebDriverWait(driver,30);
//		w.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]")))).click();
//
//		+explicitwaitime(driver, 30, driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]")));
		FluentWait	wait1=new FluentWait(30);
	WebElement	loc=(WebElement) wait1.withTimeout(20,TimeUnit.SECONDS).
		pollingEvery(20,TimeUnit.SECONDS).
		ignoring(NoSuchElementException.class).
		until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Exempted Return Manual')]"))));
	loc.click();




	}
	//	public static void explicitwaitime(WebDriver driver,int timeunit, WebElement element) {
	//		
	//		new WebDriverWait(driver, timeunit).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(element));
	//		element.click();
	//	}
}
