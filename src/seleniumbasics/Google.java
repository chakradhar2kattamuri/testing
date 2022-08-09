package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		//http://www.google.com/

		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//launch the browser
		driver.manage().window().maximize();
		
		//		driver.get("http://www.google.com/");
		//		driver.findElement(By.linkText("Gmail")).click();
		
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");

		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();


	}

}
