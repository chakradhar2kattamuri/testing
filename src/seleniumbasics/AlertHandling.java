package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		////span[contains(text() ,'Courses List')]
		//span[text()='Course list']
		driver.findElement(By.xpath("//span[contains(text() ,'Courses List')]")).click();
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[2]/a[1]")).click();
		Thread.sleep(2000);
  Alert	ale=driver.switchTo().alert();
  Thread.sleep(2000);
		
	ale.accept();	
	}

}
