package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("gma")).click();
		

	}

}
