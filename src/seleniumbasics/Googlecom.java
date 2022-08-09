package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlecom {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();//launch the browser
	driver.manage().window().maximize();
//driver.get("https://www.google.co.in/?hl=te");

//driver.findElement(By.linkText("Gmail")).click();
	
driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");

driver.findElement(By.name("email")).sendKeys("admin@admin.com");
Thread.sleep(2000);

driver.findElement(By.name("password")).sendKeys("123456");
driver.findElement(By.name("submit")).click();
Thread.sleep(2000);
System.out.println("login sucessfull");



driver.close();
}
}