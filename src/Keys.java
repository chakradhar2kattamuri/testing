import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		Actions act = new Actions (driver);
		WebElement serch=  driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		act.moveToElement(serch).sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys( org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(org.openqa.selenium.Keys.ENTER).build().perform();;


	}

}
