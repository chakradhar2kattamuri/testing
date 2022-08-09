package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Coustomizexpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");;
				driver.findElement(By.xpath("//input[@name='Submit']")).click();
				Thread.sleep(2000);
				driver.close();

	}

}
