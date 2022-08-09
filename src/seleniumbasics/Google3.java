package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//customized xpath
		//tagname[@locator='locatortext']

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button']")).submit();



	}

}
