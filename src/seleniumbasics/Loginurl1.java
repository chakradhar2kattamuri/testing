package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginurl1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\jars\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");

		//class name,name locator

		//		driver.findElement(By.className("form-control")).sendKeys("admin@admin.com");
		//		driver.findElement(By.name("password")).sendKeys("123456");
		//	driver.findElement(By.name("submit")).click();



		//css selctor locator

//		driver.findElement(By.cssSelector("body > div > div > div.middle > form > div:nth-child(1) > input")).sendKeys("admin@admin.com");
//		driver.findElement(By.cssSelector("body > div > div > div.middle > form > div:nth-child(2) > input")).sendKeys("123456");
//		driver.findElement(By.cssSelector("body > div > div > div.middle > form > div:nth-child(3) > input")).click();
//		
		
		
		// xpath locator
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("admin@admin.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/input")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/input")).submit();
		Thread.sleep(2000);
		driver.close();
		
	}

}
