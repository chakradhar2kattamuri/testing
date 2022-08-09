package windownhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://epfindia.gov.in/site_en/index.php");
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions act =new Actions(driver);
		act.moveToElement(	driver.findElement(By.partialLinkText("Establishme"))).build().perform();	
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Establishme"));
		driver.close();
	}
}